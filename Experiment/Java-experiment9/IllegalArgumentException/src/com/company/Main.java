package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            NewLoan m = new NewLoan(input.nextDouble(), input.nextInt(), input.nextDouble());
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

class NewLoan {
    private double annualInterestRate;
    private int numOfYears;
    private double loanAmount;

    public NewLoan() {
        this(7.5, 30, 100000);
    }

    public NewLoan(double annualInterestRate, int numOfYears,
                   double loanAmount) {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Annual interest rate must be positive.");
        if (numOfYears <= 0)
            throw new IllegalArgumentException("Number of years must be positive.");
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Loan amount must be positive.");
        setAnnualInterestRate(annualInterestRate);
        setNumOfYears(numOfYears);
        setLoanAmount(loanAmount);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Annual interest rate must be positive.");
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumOfYears() {
        return numOfYears;
    }

    public void setNumOfYears(int numOfYears) {
        if (numOfYears <= 0)
            throw new IllegalArgumentException("Number of years must be positive.");
        this.numOfYears = numOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Loan amount must be positive.");
        this.loanAmount = loanAmount;
    }

    public double monthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
    }

    public double totalPayment() {
        return monthlyPayment() * numOfYears * 12;
    }
}
