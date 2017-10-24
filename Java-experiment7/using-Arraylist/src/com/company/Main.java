package com.company;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new String("Linux"));
        list.add(new Date());
        list.add(new JFrame());
        list.add(new Circle());
        list.add(new Loan());//java中没有这个对象,自己写一个Loan类

        for(int i = 0;i < list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}


class Loan {
    private Double loan;

    public Loan(){
        this.loan = 0.0;
    }

    public Loan(Double loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "Loan:" + loan;

    }
}