package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");
        shape [] a = new shape[4];
        a[0] = new circle(input.nextDouble());
        a[1] = new circle(input.nextDouble());
        a[2] = new Rectangle(input.nextDouble(),input.nextDouble());
        a[3] = new Rectangle(input.nextDouble(),input.nextDouble());
        System.out.println("The total area is "+d.format(sumArea(a)));
    }

    public static double sumArea(shape[] a){
        double sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i].getArea();
        }
        return sum;
    }
}

abstract class shape{
    public abstract double getArea();
    public abstract double getPerimeter();
}

class circle extends shape{
    private double r;

    public circle() {}

    public circle(double r){
        this.r = r;
    }

    @Override
    public double getArea(){
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
}

class Rectangle extends shape{
    private double a,b;

    public Rectangle() {}

    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter(){
        return 2*a*b;
    }
}