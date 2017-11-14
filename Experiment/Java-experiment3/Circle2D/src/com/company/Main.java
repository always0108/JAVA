package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        Circle2D c1 = new Circle2D(0,0,2);
        System.out.println("Area:"+c1.getArea());
        System.out.println("Perimeter:"+c1.getPerimeter());
	    /*double x = input.nextDouble();
	    double y = input.nextDouble();
        if(c1.contains(x,y))
	        System.out.println("("+x+","+y+")"+"    在圆内");
	    else
            System.out.println("("+x+","+y+")"+"    不在圆内");
        */
        if(c1.contains(new Circle2D(2,2,3)))
            System.out.println("指定的圆在圆内");
        else
            System.out.println("指定的圆不在圆内");

        if(c1.overlaps(new Circle2D(-1,1,1)))
            System.out.println("两圆重叠");
        else
            System.out.println("两圆不重叠");

    }

}

class Circle2D{
    private double x,y,radius;

    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x,double y,double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public boolean contains(double x,double y){
        double d = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        if(d<radius)
            return true;
        return false;
    }

    public boolean contains(Circle2D a){
        double O1O2 = Math.sqrt((a.getX()-this.x)*(a.getX()-this.x)
                +(a.getY()-this.y)*(a.getY()-this.y));
        double d = this.radius - a.radius;
        if(O1O2 < d)
            return true;
        return false;
    }

    public boolean overlaps(Circle2D a) {
        double O1O2 = Math.sqrt((a.getX() - this.x) * (a.getX() - this.x)
                + (a.getY() - this.y) * (a.getY() - this.y));

        if (Math.abs(this.radius - a.radius) <= O1O2 && O1O2 <= this.radius + a.radius)
            return true;
        return false;
    }
}
