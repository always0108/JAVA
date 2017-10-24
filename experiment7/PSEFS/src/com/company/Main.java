package com.company;

import java.util.Calendar;
//子类中不重写toString()就会继承父类的toString()方法,若一直没有，则输出object类的toString()方法
public class Main {
    public static void main(String[] args) {
	    //Student stu = new Student("Mike","shanghai","123456","mike@gmail.com",1);
	    //System.out.print(stu);
        System.out.println(new Person());
        System.out.println(new Student());
        System.out.println(new Employee());
        System.out.println(new Faculty());
        System.out.println(new Staff());


    }
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends Person {
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;

    protected int status;

    public Student(){

    }

    public Student(String name,String address,String phoneNumber,String email,int status){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
    }

    @Override
    public String toString() {
        //return String.format("Student\nName:%s\nAddress:%s\nPhonenumber:%s\nEmail:%s\n" +
        //                "Status:%d\n", name,address,phoneNumber,email,status);
        return "Student";
    }
}

class Employee extends Person {
    protected String office;
    protected int salary;
    protected Calendar dateHired;

    @Override
    public String toString() {
        return "Employee";
    }
}
class Faculty extends Employee {
    public static int LECTURER = 1;
    public static int ASSISTANT_PROFESSOR = 2;
    public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;

    protected String officeHours;
    protected int rank;

    @Override
    public String toString() {
       return "Faculty";
    }
}

class Staff extends Employee {
    protected String title;

    @Override
    public String toString() {
        return "Staff";
    }
}


