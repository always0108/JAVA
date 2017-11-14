package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("the number of uppercase letters:"+countupper(str));
    }

    public static int countupper(String str){
        char [] strArr = str.toCharArray();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(strArr[i] >= 'A' && strArr[i] <= 'Z'){
                count++;
            }
        }
        return count;
    }
}


