package com.company;

import java.util.*;
public class Main {
    public static void main (String[] args) {
        Account.setAnnualInterestRate(5.5);
        //新建一个账户
        Account account = new Account("George", 1122, 1000);
        //存钱
        account.deposit(300);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(500);
        account.withdraw(10);
        account.withdraw(20);
        //输出账户信息
        account.printinformaction();
        //输出每笔交易记录
        ArrayList list = account.getTransactions();
        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
        for (int i = 0; i < list.size(); i++) {
            Transaction transaction = (Transaction)(list.get(i));
            System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(),
                    transaction.getType(), transaction.getAmount(), transaction.getBalance());
        }
    }
}

class Account{
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList transactions = new ArrayList();

    public Account() {
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id =id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "withdraw"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "deposit"));
    }

    public void printinformaction(){
        System.out.println("Name: " + name);
        System.out.println("Annual interest rate: " + Account.getAnnualInterestRate());
        System.out.println("Balance: " + balance);
    }
}

class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }
}
