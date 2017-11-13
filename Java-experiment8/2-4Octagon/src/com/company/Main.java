package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Octagon a1 = new Octagon(5);
        System.out.println("Area is " + a1.getArea());
        System.out.println("Perimeter is " + a1.getPerimeter());

        Octagon a2 = (Octagon)(a1.clone());
        System.out.println("Compare the methods " + a1.compareTo(a2));
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

class Octagon extends GeometricObject
        implements Comparable<Octagon>, Cloneable {
    private double side;
    public Octagon () {
        // Implement it
        this.side = 1;
    }

    public Octagon (double side) {
        // Implement it
        this.side = side;
    }

    @Override
    public double getArea() {
        // Implement it
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        // Implement it
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon obj) {
        if (this.side > obj.side)
            return 1;
        else if (this.side == obj.side)
            return 0;
        else
            return -1;
    }

    @Override
    public Object clone() {
//    Octagon o = new Octagon();
//    o.side = this.side;
//    return o;
//    Implement it
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}