package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
	    File file = new File("source2.txt");
	    if(file.exists()){
	        System.out.println("File already exists");
	        System.exit(1);
        }

        try(PrintWriter output = new PrintWriter(file)){
            output.print("li T zhao ");
            output.println("90");
            output.print("zhou F wei ");
            output.println("60");
        }

        try(Scanner input = new Scanner(file)){
            for(int i=0;i<2;i++){
                String firstname =  input.next();
                String mi = input.next();
                String lastname = input.next();
                int score = input.nextInt();
                System.out.println(firstname + " " + mi + " " + lastname + " " + score);
            }
        }
    }
}
