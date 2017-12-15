package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            set.add(input.next());
        }
        for(String s:set){
            System.out.println(s);
        }
    }
}
