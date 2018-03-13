package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringBuffer tmp = new StringBuffer();
        while(true){
            String str;
            str = input.nextLine();
            if(str.equals("end")){
                break;
            }else{
                tmp.append(str);
            }
        }
        String obj = input.next();
        String res = input.next();
        String a = tmp.toString();
        System.out.println(a.replaceAll(obj,res));
    }
}
