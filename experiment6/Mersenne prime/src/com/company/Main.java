package com.company;

import java.math.*;
import java.util.Calendar;
public class Main{
    public static void main(String[] args) {
        final BigInteger TWO = new BigInteger("2");
        BigInteger bigNum = TWO;

        //返回毫秒数
        Calendar start = Calendar.getInstance();
        for (long p = 2; p <= 20; p++) {
            bigNum = bigNum.multiply(TWO);

            // Display each number in five positions
            //2^p-1
            if (isPrime(bigNum.subtract(BigInteger.ONE))) {
                System.out.println(p + "\t" + bigNum.subtract(BigInteger.ONE));
            }
        }
        Calendar end = Calendar.getInstance();
        System.out.println(end.getTimeInMillis()-start.getTimeInMillis());
    }

    public static boolean isPrime(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) == 0 ||
                num.compareTo(new BigInteger("2")) == 0) {
            return true;
        }

        BigInteger halfNum = num.divide(new BigInteger("2"));
        for (BigInteger divisor = new BigInteger("2");
             divisor.compareTo(halfNum) <= 0;
             divisor = divisor.add(BigInteger.ONE)) {
            if (num.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }
}
