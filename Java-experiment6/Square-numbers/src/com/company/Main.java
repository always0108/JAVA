package com.company;

import java.math.*;

public class Main{
    public static void main(String[] args) {
        final BigInteger MAXLONG = new BigInteger(Long.MAX_VALUE + "");

        // Find the first k such that n^2 = k for some n such that k is greater than Long.MAX_VALUE
        BigInteger n = new BigInteger("" + (long)(Math.sqrt(Long.MAX_VALUE)));
        //当n平方小于MAXLONG时，n自增1
        for ( ;n.multiply(n).compareTo(MAXLONG) < 0; n = n.add(BigInteger.ONE));

        for (int i = 0; i < 10; i++) {
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);
        }
    }
}