package com.company;

import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    MyInteger a = new MyInteger(input.nextInt());
        MyInteger b = new MyInteger(input.nextInt());

        System.out.println("judge a:");
	    System.out.println(a.getValue());
        if(a.isEven()){
	        System.out.println("the num is a Even");
        }else{
            System.out.println("the num is not a Even");
        }
        if(a.isOdd()){
            System.out.println("the num is a odd");
        }else{
            System.out.println("the num is not a odd");
        }
        if(a.isPrime()) {
            System.out.println("the num is a Prime");
        }else{
            System.out.println("the num is not a Prime");
        }
        if(a.equals(5)){
            System.out.println(a.getValue()+"==5");
        }else{
            System.out.println(a.getValue()+"!=5");
        }



        if(b.equals(a)==true){
            System.out.println(a.getValue()+"=="+b.getValue());
        }else{
            System.out.println(a.getValue()+"!="+b.getValue());
        }

        //静态方法调用测试
        if(MyInteger.isEven(b.getValue()))
        {
            System.out.println("b is a Even");
        }else{
            System.out.println("b is not a Even");
        }

        System.out.println(MyInteger.parseInt("123456"));

        char[] str = {'1','2','3','4','5'};
        System.out.println(MyInteger.parseInt(str));



    }
}

class MyInteger{

    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        if(value%2==0)
            return true;
        return false;
    }

    public boolean isOdd(){
        if(value%2!=0)
            return true;
        return false;
    }

    public boolean isPrime() {
        if (value <= 1)
            return false;
        int i;
        for (i = 2; i * i <= value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int a){
        if(a%2==0)
            return true;
        return false;
    }

    public static boolean isOdd(int a){
        if(a%2!=0)
            return true;
        return false;
    }

    public static boolean isPrime(int a) {
        if ( a <= 1)
            return false;
        int i;
        for (i = 2; i * i <= a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger a){
        if(a.getValue()%2==0)
            return true;
        return false;
    }

    public static boolean isOdd(MyInteger a){
        if(a.getValue()%2!=0)
            return true;
        return false;
    }

    public static boolean isPrime(MyInteger a) {
        if ( a.getValue()<= 1)
            return false;
        int i;
        for (i = 2; i * i <= a.getValue(); i++) {
            if (a.getValue() % i == 0)
                return false;
        }
        return true;
    }

    public boolean equals(int temp){
        if(value == temp)
            return true;
        return false;
    }

    public boolean equals(MyInteger temp){
        if(value == temp.getValue())
            return true;
        return false;
    }


    public static  int parseInt(char[] str){
        String s = new String(str);
        Integer a = new Integer(s);
        return a;
    }

    public static  int parseInt(String s){
        Integer a = new Integer(s);
        return a;
    }
}
