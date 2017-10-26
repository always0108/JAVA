package com.company;

import java.util.*;

public class Main {
    public static Object max(Comparable[] a)
    {
        Arrays.sort(a);
        return a[4];
    }
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        Comparable<String>[] a=new Comparable[5];
        Comparable<Integer>[] b=new Comparable[5];
        for(int i=0;i<5;i++)
            a[i]=in.next();
        for(int i=0;i<5;i++)
            b[i]=in.nextInt();
        System.out.println("Max string is "+max(a));
        System.out.println("Max integer is "+max(b));
        in.close();
    }
}


