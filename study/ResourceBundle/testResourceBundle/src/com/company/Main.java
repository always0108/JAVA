package com.company;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
	    ResourceBundle res = ResourceBundle.getBundle("message");
	    System.out.println(res.getString("welcome") + "!");
        System.out.println(res.getString("name") + "!");
    }
}
