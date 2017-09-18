package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //DecimalFormat df = new DecimalFormat("#.000");
        Scanner input = new Scanner(System.in);
	    Triangle triangle = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
	    if(triangle.Judge() == true){
	        System.out.println("The area is: "+String.format("%.3f",triangle.ComputeArea())+".");
        // 最后还有一个句号，不要忘记
	    }

    }
}


class Triangle{
    private double a,b,c;
    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean Judge(){
        if(a+b>c && b+c>a && a+c>b){
            return true;
        }
        System.out.print("It can not be created a triangle.\n");
        return false;
    }

    double ComputeArea(){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
