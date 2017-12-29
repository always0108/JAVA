package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {// 抽象类

    //抽象方法 求面积
    public abstract double getArea();

    //抽象方法 求周长
    public abstract double getPerimeter();
}

class RPentagon extends shape{
    
    private double side;

    public RPentagon() {}

    public RPentagon(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return side*side*Math.sqrt(25+10*Math.sqrt(5))/4;
    }

    @Override
    public double getPerimeter(){
        return 5*side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        double side = input.nextDouble();

        shape rp = new RPentagon(side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}