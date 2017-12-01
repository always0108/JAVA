package com.company;

import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	    Map<String,String> map = new HashMap<>();
	    map.put("one","一");
	    map.put("two","二");
	    map.put("three","三");

	    out.println("Display key:");
	    //keySet()返回Set
        map.keySet().forEach(key -> out.println(key));

        out.println("\n");

        out.println("Display value:");
        //values
        map.values().forEach(key -> out.println(key));

        out.println("\n");

    }
}
