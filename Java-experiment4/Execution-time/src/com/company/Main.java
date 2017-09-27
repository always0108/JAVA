package com.company;

import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100000];
        int i;
        for(i = 0; i<100000; i++){
            array[i] = random.nextInt(100000);
        }
        int key = random.nextInt(100000);

        //linearSearch
        long startTime = System.currentTimeMillis();
        int result = Search.linearSearch(array,key);
        if(result >= 0)
            System.out.println("find key");
        else
            System.out.println("not find key");
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("linerSearch action end , use "+executionTime+" ms");

        //binarySearch
        startTime = System.currentTimeMillis();
        Arrays.sort(array);//二分查找本身较快，但是查找前的排序耗时
        result = Search.binarySearch(array,key);
        if(result >= 0)
            System.out.println("find key");
        else
            System.out.println("not find key");
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("binarySearch action end , use "+executionTime+" ms");
    }
}
class Search{
    public static  int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while (high >= low){
            int mid = (low + high)/2;
            if(key < list[mid])
                high = mid - 1;
            else if(key == list[mid])
                return mid;
            else
                low = mid +1;
        }
        return -low-1;//Now high < low , key not found
    }
}
