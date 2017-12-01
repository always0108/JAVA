package com.company;

import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one","一");
        map.put("two","二");
        map.put("three","三");
        //foreach(map.entrySet());
        map.forEach((key,value) -> out.printf("(键:%s，值:%s)%n",key,value));
    }

    static void foreach(Iterable<Map.Entry<String,String>> iterable){
        for(Map.Entry<String,String> entry: iterable){
            out.printf("(键:%s，值:%s)%n",entry.getKey(),entry.getValue());
        }
    }
}
