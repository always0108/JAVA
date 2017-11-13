package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        GeometricObject[] a = {new Circle(4), new Circle(2)};
        System.out.println("The total area is " + sumArea(a));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i].getArea();
        return sum;
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

class Circle extends GeometricObject{
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
}