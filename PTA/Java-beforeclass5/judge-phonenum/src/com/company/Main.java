package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(str.length() != 11){
            System.out.println("No");
            return ;
        }
	    if(str.charAt(0)!='1'){
	        System.out.println("No");
	        return ;
        }
	    for(int i = 0;i < 11; i++)
        {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                continue;
            System.out.println("No");
            return ;
        }
        System.out.println("Yes");
    }
}
