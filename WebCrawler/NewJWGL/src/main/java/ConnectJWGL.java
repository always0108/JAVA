import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.security.interfaces.RSAPublicKey;
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

    public ConnectJWGL(){ }

    public Map<String, String> getCookies() {
        return cookies;
    }

    public RSAPublicKey getRSApublickey() throws Exception{
        connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_getPublicKey.html?" +
                "time="+ new Date().getTime());
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
        response = connection.ignoreContentType(true).timeout(5000).execute();
        cookies = response.cookies();
        JSONObject jsonObject = JSON.parseObject(response.body());
        modulus = jsonObject.getString("modulus");
        exponent = jsonObject.getString("exponent");
        return MyUtils.getPublicKey(modulus,exponent);
    }

    // 获取csrftoken
    public void getCsrftoken(){
        try{
            connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_slogin.html?language=zh_CN&_t="+new Date().getTime());
            connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            response = connection.cookies(cookies).timeout(5000).execute();
            //保存csrftoken
            document = Jsoup.parse(response.body());
            csrftoken = document.getElementById("csrftoken").val();
            System.out.println(csrftoken);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //登录
    public boolean login(String stuNum,String password,RSAPublicKey rsaPublicKey) throws Exception{

        String mm = MyUtils.EncryptByPublicKey(rsaPublicKey,password);
        connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_slogin.html");
//        connection.header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
//        connection.header("Accept-Encoding","gzip, deflate");
//        connection.header("Accept-Language","zh-CN,zh;q=0.9");
//        connection.header("Cache-Control","no-cache");
//        connection.header("Connection","keep-alive");
//        connection.header("Content-Type","application/x-www-form-urlencoded");
//        connection.header("Host","www.zfjw.xupt.edu.cn");
//        connection.header("Referer","http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_slogin.html");
//        connection.header("Upgrade-Insecure-Requests","1");
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
        connection.data("csrftoken",csrftoken);
        connection.data("yhm",stuNum);
        connection.data("mm",mm);
        connection.data("mm",mm);
        connection.cookies(cookies).ignoreContentType(true)
                .method(Connection.Method.POST).execute();


        response = connection.execute();
        document = Jsoup.parse(response.body());
        System.out.println(document.getElementById("tips").text());
        return true;
    }
}
