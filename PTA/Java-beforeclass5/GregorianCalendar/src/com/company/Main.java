package com.company;

import java.util.Scanner;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        GregorianCalendar ca = new GregorianCalendar();
        ca.setTimeInMillis(num);
        System.out.println(ca.get(ca.YEAR)+"-"+ca.get(ca.MONTH)+"-"+ca.get(ca.DAY_OF_MONTH));
    }
}
