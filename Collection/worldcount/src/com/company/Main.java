package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("请输入英文：");
	    Set words = tokenSet(input.nextLine());
	    System.out.printf("不重复单字有 %d 个：%s%n",words.size(),words);
    }

    static Set tokenSet(String line)
    {
        String[] tokens = line.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}
