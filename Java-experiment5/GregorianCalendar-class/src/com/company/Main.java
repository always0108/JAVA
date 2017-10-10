package com.company;

import java.util.GregorianCalendar;
public class Main {

    public static void main(String[] args) {
	    //获取当前的时间
        GregorianCalendar calendar = new GregorianCalendar();
	    //GregorianCalendar.MONTH 中的0代表1月，11代表12月。
	    System.out.println(String.format("%4d-%02d-%02d",
                calendar.get(GregorianCalendar.YEAR),
                calendar.get(GregorianCalendar.MONTH)+1,
                calendar.get(GregorianCalendar.DAY_OF_MONTH)));
	    //重新设置时间
	    calendar.setTimeInMillis(1234567898765L);
        System.out.println(String.format("%4d-%02d-%02d",
                calendar.get(GregorianCalendar.YEAR),
                calendar.get(GregorianCalendar.MONTH)+1,
                calendar.get(GregorianCalendar.DAY_OF_MONTH)));
    }
}
