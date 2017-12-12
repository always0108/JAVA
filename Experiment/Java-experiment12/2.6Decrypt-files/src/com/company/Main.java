package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an encrypted file: ");
        File inputFile = new File(input.nextLine());
        System.out.print("Enter the output file: ");
        File outputFile = new File(input.nextLine());

        try (
                BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream(inputFile));
                BufferedOutputStream output = new BufferedOutputStream(
                        new FileOutputStream(outputFile));
        ) {
            int value;
            while ((value = in.read()) != -1) {
                output.write(value - 5);
            }
        }catch (java.io.IOException ex){
            System.out.println("close");
        }
    }
}
