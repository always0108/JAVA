package com.company;


import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	    Properties props = new Properties();
	    props.setProperty("username","admin");
	    props.setProperty("password","123456");

	    out.println(props.getProperty("username"));
        out.println(props.getProperty("password"));
    }
}
