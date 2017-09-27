package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Comparable;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input the num of students:");
        int n = input.nextInt();
        Student[] array = new Student[n];
        int i;
        for(i = 0;i < n;i++){
            array[i] = new Student();
        }
        for(i = 0;i < n;i++){
            System.out.print("Name:");
            array[i].setName(input.next());
            System.out.print("Score:");
            array[i].setAge(input.nextInt());
        }
        Arrays.sort(array);
        for(i = 0;i < n;i++){
            System.out.println(array[i].getName()+"----"+array[i].getAge());
        }
    }
}

class Student implements Comparable
{
    private int score;
    private String name;

    public Student(){
        this.score = 0;
        this.name = null;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.score = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return score;
    }

    public int compareTo(Object o)
    {
        Student s=(Student)o;
        //在成绩相同时，按照名字字母序来排序
        if (this.score == s.score)
            return this.name.compareTo(s.name);
        //升序
        /*if (this.score < s.score)
            return -1;
        else if (this.score == s.score)
            return 0;
        else
            return 1;
        */
        if (this.score < s.score)
            return 1;
        else if (this.score == s.score)
            return 0;
        else
            return -1;
    }
}