package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try{
                int a = input.nextInt();
                int b = input.nextInt();
                //Sum不要写成sum，要不过不了
                System.out.println("Sum is "+(a+b));
                flag = false;
            }catch(InputMismatchException ex){
                System.out.println("Incorrect input and re-enter two integers:");
                input.nextLine();
            }
        }
    }
}


