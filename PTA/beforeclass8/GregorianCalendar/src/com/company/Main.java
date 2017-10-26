package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    long time = input.nextLong();
        Calendar a = new GregorianCalendar();
        a.setTimeInMillis(time);
        System.out.print(a.get(Calendar.YEAR)+"-"+
                a.get(Calendar.MONTH)+"-"+a.get(Calendar.DAY_OF_MONTH));
    }
}
