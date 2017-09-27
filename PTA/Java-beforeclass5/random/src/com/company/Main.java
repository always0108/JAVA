package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        Random random = new Random(k);

        for(int i = 0; i < n;i++){
            if(i==n-1){
                System.out.println(random.nextInt(m));
            }else {
                random.nextInt(m);
            }
        }
    }
}
