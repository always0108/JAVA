package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the radius of circle1:");
        ComparableCircle circle1 = new ComparableCircle(input.nextDouble());
        System.out.println("please input the radius of circle2:");
        ComparableCircle circle2 = new ComparableCircle(input.nextDouble());

        ComparableCircle circle3 = (ComparableCircle) Max.max(circle1, circle2);
        System.out.println("The max circle's radius is " + circle3.getRadius());
    }
}

class Circle{
    private double radius;
    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else
            return 0;
    }
}

class Max{
    public static ComparableCircle max
    (ComparableCircle o1, ComparableCircle o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}
