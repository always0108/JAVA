package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List list = new ArrayList();

        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hallo");
        //list.add(1);
        for (int i = 0; i < list.size(); i++) {
            //String str = (String) list.get(i); // 1
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
