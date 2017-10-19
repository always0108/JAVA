package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("input the number of student:");
	    int n = input.nextInt();
	    Score [] arr = new Score[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = new Score(input.next(),input.nextDouble());
        }
        double total = 0, average = 0;
        for(int i = 0; i < n; i++){
            total = total + arr[i].getScore();
        }
        average = total/n;
        System.out.println("total = "+total);
        System.out.println("average = "+average);
    }
}

class Score{
    private String name;
    private double score;

    public Score(){
        name = null;
        score = 0;
    }

    public Score(String name,double score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
