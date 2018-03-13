package com.company;


import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	    Date date = new Date();

	    System.out.println(dateFormat.format(date));

	    Calendar calendar = new GregorianCalendar();

		System.out.println(calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DAY_OF_MONTH));


    }
}




