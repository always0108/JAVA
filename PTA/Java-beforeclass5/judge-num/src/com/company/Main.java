package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int count = 0;
        for(int i = 0;i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                continue ;
            }else if(ch == '.') {
                count++;
                if (count > 1){
                    System.out.println("false");
                    return;
                }
            }else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
