package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int total = 0;
        int count = 0;

        try (
                ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream("Exercise17_07.dat")));
        ) {
            while (true) {
                Loan loan = (Loan)(input.readObject());
                total += loan.getLoanAmount();
                count++;
            }
        }
        catch (EOFException ex) {
            System.out.println("Number of loan objects is " + count);
            System.out.println("Total loan amount is " + total);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Loan implements java.io.Serializable{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (Math.pow(1/(1+monthlyInterestRate), numberOfYears*12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
