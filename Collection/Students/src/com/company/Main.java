package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set students = new HashSet();
        students.add(new Student("Justin","25"));
        students.add(new Student("Mike","38"));
        students.add(new Student("Justin","25"));
        System.out.println(students);

    }
}

class Student{
    private String name;
    private String number;

    public Student(String name,String number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("(%s,%s)",name,number);
    }
}