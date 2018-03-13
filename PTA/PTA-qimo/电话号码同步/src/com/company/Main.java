package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TreeMap<String,String> map = new TreeMap<>();

        //模拟读第一个文件
        String name = input.next();

        while(!name.equals("end")){
            String number = input.next();
            map.put(name,number);
            name = input.next();
        }

        //模拟读第二个文件
        name = input.next();
        while(!name.equals("end")){
            String number = input.next();
            map.put(name,number);
            name = input.next();
        }

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
