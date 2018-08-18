import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConnectJWGL {
    private String stuNum;
    private String stuName;
    private String __VIEWSTATE = "";
    private Map<String,String> cookies = new HashMap<>();
    private Connection connection;
    private Connection.Response response;
    private Document document;

    public ConnectJWGL(){
        connectIndex();
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    //首次连接获取cookies和__VIEWSTATE
    public void connectIndex(){
        try{
            connection = Jsoup.connect("http://222.24.62.120");
            connection.header("User-Agent",// 配置模拟浏览器
                    "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            response = connection.timeout(3000).execute();
            //保存Cookies
            cookies = response.cookies();
            // 将响应转换为Dom树，以便获取__VIEWSTATE
            document = Jsoup.parse(response.body());
            for(Element element:document.getElementsByTag("input")) {
                if (element.attr("name").equals("__VIEWSTATE")) {
                    __VIEWSTATE = element.val();
                    break;
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    //下载验证码到本地
    public void downloadCheckcode(){
        try{
            String captcha_url = "http://222.24.62.120/CheckCode.aspx";
            response = Jsoup.connect(captcha_url)
                    .cookies(cookies).ignoreContentType(true) // 获取图片需设置忽略内容类型
                    .userAgent("Mozilla").method(Connection.Method.GET).timeout(3000).execute();
            byte[] bytes = response.bodyAsBytes();

            //在本地建立文件夹
            File file = new File("/home/limeng/Desktop/checkcode.aspx");
            if (file.exists()) {
                file.delete();
            }
            OutputStream output = new FileOutputStream(file);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(output);
            bufferedOutput.write(bytes);
            bufferedOutput.close();
            output.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    //登录
    public boolean login(String stuNum,String password,String checkCode){
        this.stuNum = stuNum;
        stuName = "";

        //填充post数据
        Map<String, String> datas = new HashMap<>();
        datas.put("__VIEWSTATE",__VIEWSTATE);
        datas.put("txtUserName",stuNum);
        datas.put("TextBox2",password);
        datas.put("txtSecretCode",checkCode);
        datas.put("RadioButtonList1","%D1%A7%C9%FA");
        datas.put("Button1","");
        datas.put("lbLanguage","");
        datas.put("hidPdrs","");
        datas.put("hidsc","");

        try{
            connection = Jsoup.connect("http://222.24.62.120/default2.aspx");
            connection.header("User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            // 设置cookie和post上面的map数据
            response = connection.postDataCharset("GB2312").ignoreContentType(true).method(Connection.Method.POST)
                    .data(datas).cookies(cookies).execute();
            document = response.parse();

            if(document.title().equals("欢迎使用正方教务管理系统！请登录")){
                String error = document.getElementsByTag("script").get(1).data();
                Pattern pattern = Pattern.compile("(?<=alert\\(')[^']*");
                Matcher matcher = pattern.matcher(error);
                while(matcher.find()){
                    System.out.print("登陆失败,");
                    System.out.println(matcher.group());
                }
                return false;
            }else {
                stuName = document.getElementById("xhxm").text();
                stuName = stuName.substring(0,stuName.length()-2);
                System.out.println("登陆成功，欢迎你"+stuName+"!");
                return true;
            }
        }catch (IOException ex){
            ex.printStackTrace();
            return false;
        }
    }

    //获取学生个人信息
    public void getStudentInformation(){
        try{
            String infoURL = "http://222.24.62.120/xsgrxx.aspx?xh="+stuNum+"&xm="+URLEncoder.encode(stuName,"GB2312")+"&gnmkdm=N121501";
            connection = Jsoup.connect(infoURL);
            response = connection.ignoreContentType(true).method(Connection.Method.GET)
                            .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0")
                            .referrer("http://222.24.62.120/xs_main.aspx?xh="+stuNum)
                            .cookies(cookies).postDataCharset("GB2312").timeout(3000).execute();
            document = response.parse();
            if(document.getElementById("lbxsgrxx_xb") != null){
                System.out.println("---基本信息---");
                System.out.println(document.getElementById("lbxsgrxx_xb").text()+document.getElementById("lbl_xb").text());
                System.out.println(document.getElementById("lbxsgrxx_csrq").text()+document.getElementById("lbl_csrq").text());
                System.out.println(document.getElementById("lbxsgrxx_xy").text()+document.getElementById("lbl_xy").text());
                System.out.println(document.getElementById("lbxsgrxx_dqszj").text()+document.getElementById("lbl_dqszj").text());
                System.out.println(document.getElementById("TDzymc").text()+document.getElementById("lbl_zymc").text());
                System.out.println(document.getElementById("lbxsgrxx_xzb").text()+document.getElementById("lbl_xzb").text());
            }else {
                System.out.println("获取信息失败");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
