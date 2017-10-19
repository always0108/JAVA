package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first string:");
	    String s1 = input.next();
        System.out.print("Enter the second string:");
        String s2 = input.next();
        System.out.println(prefix(s1,s2));
    }

    public static String prefix(String s1, String s2){
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();

        if(arr1[0] != arr2[0]) {
            return s1+" and "+s2+" have no common prefix";
        }

        StringBuffer result = new StringBuffer();
        result.append("The common prefix is ");
        for(int i = 0; i < s1.length() && i < s2.length(); i++) {
            if(arr1[i] != arr2[i]){
                break;
            } else{
                result.append(arr1[i]);
            }
        }
        return result.toString();
    }
}


