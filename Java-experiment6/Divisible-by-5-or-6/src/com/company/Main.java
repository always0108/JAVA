package com.company;

import java.math.*;

public class Main{
    public static void main(String[] args) {
        // bigNum represents Long.MAX_VALUE
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        // bigNum is now larger than Long.MAX_VALUE
        bigNum.add(BigInteger.ONE);

        int count = 1;
        while (count <= 10) {
            //remainder可以用来取余，并看余数是否为0
            if (bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
                    bigNum.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);
        }
    }
}
