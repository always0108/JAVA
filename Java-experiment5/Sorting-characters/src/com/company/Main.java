package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(sort1(str));
}

public static String sort1(String str){
        //将字符串转化为字符数组，对字符数组排序，并返回结果
        //字符串是一个对象，一旦创建就无法改变，返回时该创建一个新的
        char [] stringArr = str.toCharArray();
        Arrays.sort(stringArr);
        return new String(stringArr);
    }
}
