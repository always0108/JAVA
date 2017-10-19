package com.company;

import  java.util.Scanner;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        PersonOverride[] array = new PersonOverride[n1];
        for (int i = 0; i < n1; i++) {
            array[i] = new PersonOverride();
        }
        int n2 = input.nextInt();
        PersonOverride[] array2 = new PersonOverride[n2];
        int length = 0;
        for (int i = 0; i < n2; i++) {
            String name = input.next();
            int age = input.nextInt();
            boolean gender;
            String bool = input.next();
            if(bool.equals("true"))
                gender = true;
            else
                gender = false;
            int flag = 0;
            for (int j = 0; j < length; j++) {
                if (array2[j].equals(name, age, gender)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                array2[length] = new PersonOverride(name, age, gender);
                length++;
            }
        }
        for (int i = 0; i < n1; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println(length);
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }
}

class PersonOverride{
    private String name;
    private int age;
    private boolean gender;

    //无参数
    public PersonOverride()
    {
        this("default",1,true);
    }

    //有参数
    public PersonOverride(String name, int age, boolean gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    public String toString(){
        return name+"-"+age+"-"+gender;
    }

    public boolean equals(String name, int age, boolean gender){
        if(this.age == age && this.gender == gender  && this.name.equals(name))
        {
            return true;
        }
        return false;
    }
}