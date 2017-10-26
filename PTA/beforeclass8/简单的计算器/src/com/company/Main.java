package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int i;
        if (str.contains("/")){
            String[] a = str.split("/", 0);
            BigDecimal tmp1 = new BigDecimal(a[0]);
            BigDecimal tmp2 = new BigDecimal(a[1]);
            BigDecimal result = tmp1.divide(tmp2);
            System.out.println(result);
        } else if (str.contains("+")) {
            String[] a = str.split("\\+", 0);
            BigDecimal tmp1 = new BigDecimal(a[0]);
            BigDecimal tmp2 = new BigDecimal(a[1]);
            BigDecimal result = tmp1.add(tmp2);
            System.out.println(result);
        } else if (str.contains("-")){
            String[] a = str.split("-", 0);
            BigDecimal tmp1 = new BigDecimal(a[0]);
            BigDecimal tmp2 = new BigDecimal(a[1]);
            BigDecimal result = tmp1.subtract(tmp2);
            System.out.println(result);
        } else if(str.contains("*")){
            String[] a = str.split("\\*", 0);
            BigDecimal tmp1 = new BigDecimal(a[0]);
            BigDecimal tmp2 = new BigDecimal(a[1]);
            BigDecimal result = tmp1.multiply(tmp2);
            System.out.println(result);
        }
    }
}


