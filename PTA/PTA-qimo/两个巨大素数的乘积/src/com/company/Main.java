package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        System.out.println(a.divide(b));
    }
}
