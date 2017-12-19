package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
	    nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        System.out.println(nums);
	    sort(nums);
	    System.out.println(nums);

	    ArrayList<String> strings = new ArrayList<>();
	    strings.add("green");
        strings.add("blue");
        strings.add("yellow");
        strings.add("red");
        System.out.println(strings);
        sort(strings);
        System.out.println(strings);

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        int i,j;
        for(i=0;i<list.size();i++){
            for(j=0;j<list.size()-i-1;j++){
                E a = list.get(j);
                E b = list.get(j+1);
                if(a.compareTo(b)>0){
                    list.set(j+1,a);
                    list.set(j,b);
                }
            }
        }
    }
}
