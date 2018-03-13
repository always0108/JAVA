package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger("9223372036854775808");
        BigInteger c=BigInteger.ONE;
        BigInteger d=BigInteger.ZERO;
        for(int i=0;i<3;i++){
            while(b.remainder(a)!=d ){
                b=b.add(c);
            }
            System.out.println(b);
            b=b.add(c);
        }
    }
}
