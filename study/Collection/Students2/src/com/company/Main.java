package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set students = new HashSet();
        students.add(new Student2("Justin","31"));
        students.add(new Student2("Mike","25"));
        students.add(new Student2("Justin","31"));
        System.out.println(students);
    }
}

class Student2{
    private String name;
    private String number;

    public Student2(String name,String number){
        this.name = name;
        this.number = number;
    }

    //NetBeans自动生成equals()与hashCode()
    //就示范而言已经足够了

    @Override
    public int hashCode(){
        //Objects有hash()方法可用
        //以下可以简化为return Objects.hash(name,number);
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.number);
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(getClass() != obj.getClass()){
            return false;
        }

        final Student2 other = (Student2)obj;

        if(!Objects.equals(this.name,other.name)){
            return false;
        }

        if(!Objects.equals(this.number,other.number)){
            return false;
        }

        return true;
    }

    @Override
    public String toString(){
        return String.format("(%s,%s)",name,number);
    }
}

