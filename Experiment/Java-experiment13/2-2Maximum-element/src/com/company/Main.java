package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] strings = {"abc","green","blue"};
	    Integer[] nums = {1,5,4,8,2};
	    System.out.println(max(strings));
	    System.out.println(max(nums));
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i=1;i<list.length;i++){
            if(max.compareTo(list[i])<0){
               max = list[i];
            }
        }
        return max;
    }
}
