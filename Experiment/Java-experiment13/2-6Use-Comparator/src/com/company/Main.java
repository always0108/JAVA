package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    Integer[] nums = {1,9,4,0,10,5};
	    selectionSort(nums,new Cmp());
	    for(Integer a:nums)
	        System.out.print(a+" ");
	    System.out.println();
    }

    public static <E> void selectionSort(E[] list,
                                         Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
}

class Cmp implements Comparator {
    @Override
    public int compare(Object arg0, Object arg1) {
        int a = (int) arg0;
        int b = (int) arg1;
        return a-b;
    }
}


