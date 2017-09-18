package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student stu = new Student(input.next(),input.nextInt(),input.next());
        stu.toString();
    }
}

class Student{
    private String name;
    private String sex;
    private int age;

    Student(String name,int age,String sex){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    String getName(){
        return name;
    }

    String getSex(){
        return sex;
    }

    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }

    void setSex(String sex){
        this.sex = sex;
    }

    void setAge(int age){
        this.age = age;
    }

    public String toString(){
        String age1 = Integer.toString(age);
        String s = "Student [name='"+name+"', sex='"+sex+"', age="+age1+"]";
        System.out.println(s);
        return  s;
    }
}
