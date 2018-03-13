package com.company;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,Double>  map = new HashMap<>();
        String name = input.next();
        while(!name.equals("noname")){
            double score = input.nextDouble();
            map.put(name,score);
            input.nextLine();
            name = input.next();
        }

        DecimalFormat df = new DecimalFormat(".##");
        name = input.next();
        if(map.containsKey(name))
            System.out.println(df.format(map.get(name)*0.21));
        else
            System.out.println("Not found.");
    }
}