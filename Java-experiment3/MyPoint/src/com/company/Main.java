package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    MyPoint a = new MyPoint();
	    MyPoint b = new MyPoint(input.nextDouble(),input.nextDouble());
	    System.out.println(a.distance(b));
        System.out.println(b.distance(input.nextDouble(),input.nextDouble()));
    }
}

class MyPoint{
    private double x,y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public  MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return  x;
    }

    public double getY(){
        return  y;
    }

    public double distance(MyPoint a){
        double m = a.getX();
        double n = a.getY();
        return Math.sqrt((x-m)*(x-m)+(y-n)*(y-n));
    }

    public double distance(double x,double y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
}
