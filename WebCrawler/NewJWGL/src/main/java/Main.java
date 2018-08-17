import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.security.interfaces.RSAPublicKey;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        ConnectJWGL connectJWGL = new ConnectJWGL();
        RSAPublicKey rsaPublicKey = connectJWGL.getRSApublickey();
        connectJWGL.getCsrftoken();
        connectJWGL.login("04163164","ldxz19980108!@",rsaPublicKey);

//        Connection connection = Jsoup.connect("http://www.zfjw.xupt.edu.cn/jwglxt/xtgl/login_getPublicKey.html?" +
//                "time="+ new Date().getTime());
//        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
//        Connection.Response response = connection.ignoreContentType(true).timeout(5000).execute();
//        JSONObject jsonObject = JSON.parseObject(response.body());
//        String modulus = jsonObject.getString("modulus");
//        String exponent = jsonObject.getString("exponent");
//        System.out.println(modulus);
//        System.out.println(exponent);
//        String result = MyUtils.EncryptByPublicKey(MyUtils.getPublicKey(modulus,exponent),"12345678");
//        System.out.println(result);
//        System.out.println(result.length());
    }

}
