package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("请输入要检测的密码:");
	    String str = input.next();
	    CheckPassword check = new CheckPassword(str);
	    if(check.checkValid())
	        System.out.println("Valid Password");
	    else
            System.out.println("Invalid Password");
    }
}

class CheckPassword{

    private char [] strArr;
    private int len;
    //构造方法
    CheckPassword(String str){
        strArr = str.toCharArray();
        len = str.length();
    }

    CheckPassword(){
        strArr = null;
        len = 0;
    }

    //至少8个字符
    public boolean checkLength(){
        if(len < 8)
            return false;
        else
            return true;
    }

    //只能包含字母和数字
    public boolean CheckChar(){
        for(int i = 0; i < len; i++){
            if((strArr[i] >= '0' && strArr[i] <= '9')||
                    (strArr[i] >= 'a' && strArr[i] <= 'z')||
                    (strArr[i] >= 'A' && strArr[i] <= 'Z'))
                continue;
            else
                return false;
        }
        return true;
    }

    //至少两个数字
    public boolean checkNum(){
        int count = 0;
        for(int i = 0; i < len; i++){
            if(strArr[i] >= '0' && strArr[i] <= '9')
                count++;
        }
        if(count < 2)
            return false;
        else
            return true;
    }


    public boolean checkValid() {
        if (CheckChar() && checkLength() && checkNum())
            return true;
        else
            return false;
    }
}
