import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String stuNum;
        String password;
        String checkCode;

        Scanner input = new Scanner(System.in);
        ConnectJWGL connectJWGL = new ConnectJWGL();
        connectJWGL.downloadCheckcode();
        System.out.print("请输入学号：");
        stuNum = input.next();
        System.out.print("请输入密码：");
        password = input.next();
        System.out.print("请输入验证码：");
        checkCode = input.next();
        if(connectJWGL.login(stuNum,password,checkCode)){
            connectJWGL.getStudentInformation();
        }
        input.close();
    }
}
