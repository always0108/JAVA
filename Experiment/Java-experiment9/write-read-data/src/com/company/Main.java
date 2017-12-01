package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("Exercise12_15.txt");

        if (file.exists()){
            file.delete();
        }

        if (!file.exists()) {
            try (
                  PrintWriter output = new PrintWriter(file);
            ) {
                for (int i = 1; i <= 100; i++) {
                    output.print((int)(Math.random() * 100) + " ");
                }
            }
        }

        try (
                Scanner input = new Scanner(file);
        ) {
            int[] numbers = new int[100];
            for (int i = 0; i < 100; i++)
                numbers[i] = input.nextInt();
            Arrays.sort(numbers);
            for (int i = 0; i < 100; i++) {
                System.out.printf("%4d",numbers[i]);
            if((i+1)%10==0)
                System.out.print("\n");
            }
        }
    }
}
