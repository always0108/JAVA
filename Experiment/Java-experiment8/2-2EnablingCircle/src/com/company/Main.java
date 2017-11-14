package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the radius of circle1:");
        Circle a = new Circle(input.nextDouble());
        System.out.println("input the radius of circle2:");
        Circle b = new Circle(input.nextDouble());
        System.out.print("circle1与circle2是否相同:");
        System.out.println(a.equals(b));
        int result = a.compareTo(b);
        if(result == 1)
            System.out.println("circle1>circle2");
        else if(result == 0)
            System.out.println("circle1=circle2");
        else
            System.out.println("circle1<circle2");
    }
}

abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString(){
        return "create on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    //比较两个圆的大小
    @Override
    public int compareTo(Circle obj) {
        if (this.getArea() > obj.getArea())
            return 1;
        else if (this.getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }

    //判断两个对象是否相同
    public boolean equals(Object obj) {
        return this.radius == ((Circle)obj).radius;
    }
}
