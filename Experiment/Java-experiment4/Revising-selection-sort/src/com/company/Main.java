package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        double[] array = new double[10];
	    for(int i = 0; i < 10; i++){
	        array[i] = input.nextDouble();
        }

        //java.util.Arrays类的排序方法，经过调优的快速排序法
        //Arrays.sort(array);           //正序
        //Arrays.parallelSort(array);   //逆序

        //选择排序的两种实现方式
        //Sort.selectionSort1(array);
        Sort.selectionSort2(array);
        for(int i = 0; i < 10; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

class Sort{
    public static void selectionSort1(double[] list){
        for(int i = 0;i < list.length-1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i+1;j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void selectionSort2(double[] list){
        for(int i = list.length-1;i >= 0; i--){
            double currentMax = list[i];
            int currentMaxIndex = i;

            for(int j = i-1;j >= 0; j--){
                if(currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}


