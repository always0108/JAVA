import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.*;
import java.security.PublicKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ConnectJWGL {

    private Map<String,String> cookies = new HashMap<>();
    private String modulus;
    private String exponent;
    private String csrftoken;
    private Connection connection;
    private Connection.Response response;
    private Document document;

    public ConnectJWGL(){
        connectIndex();
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    //首次连接获取cookies和csrftoken
    public void connectIndex(){
        try{
            connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_slogin.html?language=zh_CN&_t=1533888613519");
            connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            response = connection.timeout(5000).execute();
            //保存Cookies
            cookies = response.cookies();
            document = Jsoup.parse(response.body());
            csrftoken = document.getElementById("csrftoken").val();
            getRSApublickey();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public PublicKey getRSApublickey() throws Exception{
        Date time = new Date();
        //connection = Jsoup.connect("http://202.119.206.62/jwglxt/xtgl/login_getPublicKey.html?time="+time.getTime());
        connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_getPublicKey.html?time="+time.getTime());
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
        response = connection.ignoreContentType(true).cookies(cookies).timeout(5000).execute();
        JSONObject jsonObject = JSON.parseObject(response.body());
        modulus = jsonObject.getString("modulus");
        exponent = jsonObject.getString("exponent");
        PublicKey publicKey = MyUtils.getPublicKey(modulus,exponent);
        return publicKey;
    }

    //登录
    public boolean login(String stuNum,String password,PublicKey publicKey) throws Exception{

        String mm = MyUtils.EncryptByPublicKey(publicKey,password);
        //填充post数据
        Map<String, String> datas = new HashMap<>();
        datas.put("csrftoken",csrftoken);
        datas.put("yhm",stuNum);
        datas.put("mm",mm);
        datas.put("mm",mm);

        try{
            connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_slogin.html");
            connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            // 设置cookie和post上面的map数据
            response = connection.postDataCharset("GB2312").ignoreContentType(true).method(Connection.Method.POST)
                    .data(datas).cookies(cookies).execute();
            document = response.parse();
            System.out.println(response.body());
            return true;
        }catch (IOException ex){
            ex.printStackTrace();
            return false;
        }
    }
}
