package com.company;

import java.util.Scanner;
import java.text.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //long time = input.nextLong();
        long time = 10000;
        for(int i = 1;i <= 8; i++){
            MyDate date = new MyDate(time);
            System.out.println(date);
            time = time * 10;
        }
    }
}

class MyDate{

    private Date date;

    //规定输出的格式
    SimpleDateFormat myFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");

    //构造方法
    public MyDate(long time)
    {
           date = new Date(time);
    }

    //返回是哟啊输出的字符串
    public String toString() {
        return myFormat.format(date);
    }
}