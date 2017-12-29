package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();

        HashMap<String,String> map = new HashMap<>();
        map.put("Australian","Spain");
        map.put("Holland","Chile");
        map.put("Cameroon","Brazil");
        map.put("Croatia","Mexico");
        map.put("Spain","Australian");
        map.put("Chile","Holland");
        map.put("Brazil","Cameroon");
        map.put("Mexico","Croatia");

        if(map.containsKey(a)) {
            System.out.println(a+" team's rival is "+map.get(a)+".");

        }else {
            System.out.println(a+"'s team has no match today.");
        }

        input.close();

    }
}
