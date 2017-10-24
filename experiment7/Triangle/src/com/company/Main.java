package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    double side1,side2,side3;
	    side1 = 1;
	    side2 = 1.5;
	    side3 = 1;
	    if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 )
        {
            Triangle triangle = new Triangle(side1,side2,side3);
            triangle.father("yellow",true);
            System.out.println(triangle.toString());
            System.out.println("Area:" + triangle.getArea());
            System.out.println("Perimeter:" + triangle.getPerimeter());
            triangle.printcolor();
            triangle.printFilled();
        }
    }
}

class GeometricObject{
    private String color = "white";
    private boolean filled;
    private Date dataCreate;

    public GeometricObject(){
        dataCreate = new Date();
    }

    public GeometricObject(String color,boolean filled){
        dataCreate = new Date();
        this.color = color;
        this.filled = filled;
    }

    public Date getDataCreate() {
        return dataCreate;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "create on" + dataCreate + "\ncolor:" + color +"and filled" + filled;
    }
}

class Triangle extends GeometricObject{
    private double side1,side2,side3;

    public Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void father(String color,boolean filled){
        super.setColor(color);
        super.setFilled(filled);
    }

    public void printcolor(){
        System.out.println("color:" + super.getColor());
    }

    public void printFilled(){
        System.out.println("Filled:" + super.isFilled());
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double getPerimeter(){
        return side1 + side2 +side3;
    }

    public String toString(){
        return "Triangle:side1 = " + side1 + "  side2 = " + side2 + "  side3 = " + side3;
    }
}
