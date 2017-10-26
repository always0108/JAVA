package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.text.DecimalFormat;
import java.util.*;

abstract class shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class RegularPolygon extends shape{
    private double side;
    private int n;

    public RegularPolygon() {}

    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
    }
    
    @Override
    public double getArea(){
        //return n*side*side/(Math.tan((Math.PI/n))*4);
        return (n*side*side)/(Math.tan(Math.toRadians(180/n))*4);
    }

    @Override
    public double getPerimeter(){
        return n*side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        int n=input.nextInt();
        double side = input.nextDouble();

        shape rp = new  RegularPolygon(n,side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}
