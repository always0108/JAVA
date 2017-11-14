package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueinput = true;
        do{
            try{
                System.out.println("Input two integer:");
                int a = input.nextInt();
                int b = input.nextInt();

                System.out.printf("%d + %d = %d%n",a,b,a+b);

                continueinput = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again.(Incorrect input)");
                System.out.println("Two integer are required");
                input.nextLine(); //Discard input
                //可以用来吸收回车符
            }
        }while(continueinput);
    }
}
