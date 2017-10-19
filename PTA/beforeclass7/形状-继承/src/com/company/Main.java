package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int length1 = 0,length2 = 0;
	    Shape [] shape = new Shape[n];
	    for(int i = 0; i < n; i++){
	        String kind = input.next();
	        if(kind.equals("rect")) {
                shape[i] = new Rectangle(input.nextDouble(),input.nextDouble());
            }else if(kind.equals("cir")){
	            shape[i] = new Circle(input.nextDouble());
            }
        }
        double sumArea = 0,sumPerimeter = 0;
        for(int i=0;i < n;i++)
        {
            sumArea = sumArea + shape[i].getArea();
            sumPerimeter = sumPerimeter + shape[i].getPerimeter();
        }
        System.out.println(sumPerimeter);
        System.out.println(sumArea);
        for(int i = 0; i < n; i++){
            if(i==0)
                System.out.print("[");
            if(i!=n-1)
                System.out.print(shape[i]+", ");
            else
                System.out.println(shape[i]+"]");
        }
        for(int i = 0; i < n; i++){
            shape[i].printclass();
        }
    }
}

class Shape{
    private static double PI = 3.14;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return -1;
    }

    public double getPI(){
        return PI;
    }
    public double getArea(){
        return -1;
    }

    public void printclass(){
        System.out.print(getClass());
        System.out.print(",");
        System.out.println(getClass().getSuperclass());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*super.getPI()*radius;
    }

    public double getArea(){
        return getPI()*radius*radius;
    }

    public String toString(){
        return "Circle [radius="+new BigDecimal(radius).stripTrailingZeros()+"]";
    }
}


class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(){
    }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2*(width + height);
    }

    public double getArea(){
        return width*height;
    }

    public String toString(){
        return "Rectangle [width="+new BigDecimal(width).stripTrailingZeros()+", length="+new BigDecimal(height).stripTrailingZeros()+"]";
    }
}