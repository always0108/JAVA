package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        try (
              DataInputStream dis =
                      new DataInputStream(new FileInputStream("Exercise17_03.dat"));
        ) {
            int total = 0;
            //还可以继续读取的化
            while (dis.available() > 0) {
                int temp = dis.readInt();
                total += temp;
                count++;
                System.out.print(temp + " ");
            }

            System.out.println("\nCount is " + count);
            System.out.println("\nTotal is " + total);
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
