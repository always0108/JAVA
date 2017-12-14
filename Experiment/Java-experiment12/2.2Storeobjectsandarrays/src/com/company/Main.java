package com.company;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    //关闭资源至关重要！！！
    public static void main(String[] args) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("Exercise17_05.dat"));
            output.writeObject(new int[]{1, 2, 3, 4, 5});
            output.writeObject(new java.util.Date());
            output.writeDouble(5.5);
            output.close();
        } catch (java.io.IOException ex) {
            System.out.println("File can not open");
        }

        try {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("Exercise17_05.dat"));
            int[] numbers =  (int[] )input.readObject();
            for(int num:numbers){
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println((java.util.Date)(input.readObject()));
            System.out.print(input.readDouble());
            input.close();
        } catch (java.io.IOException ex1) {
            System.out.println("File can not open");
        } catch (java.lang.ClassNotFoundException ex2) {
            System.out.println("read fail");
        }
    }
}
