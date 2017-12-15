package com.company;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        HashMap<String,Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while(true){
            String s = input.next();
            if(s.equals("noname")){
                break;
            }
            int a = input.nextInt();
            map.put(s,a);
        }
        String res = input.next();
        if(map.get(res) == null){
            System.out.println("Not found.");
        }else{
            System.out.println(df.format(map.get(res)*0.21));
        }
    }
}
