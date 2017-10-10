package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //以1000为种子创建一个Random对象
        Random random = new Random(1000);
        for(int i = 1;i <= 50;i++) {
            System.out.print(String.format("第%2d个random：",i));
            System.out.println(random.nextInt(100));
        }
    }
}


