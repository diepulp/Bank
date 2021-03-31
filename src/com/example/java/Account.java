package com.example.java;

public abstract class Account implements Actions  {

        private int accountNumber;
        private String userName;
        private double accountChecking;
        private double accountSavings;

    //default constructor
    public Account(){}

    // constructs both checking and savings accounts
    public Account(int accountNumber, String userName, double accountChecking,
                   double accountSavings){
        this.accountNumber = accountNumber;
        this.userName = userName;
        setAccountChecking(accountChecking);
        setAccountSavings(accountSavings);
    }

// constructor for checking account

    public Account(String userName, int accountNumber,
                   double accountChecking){
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountChecking = accountChecking;

    }

    //constructor for savings account

    public Account(double accountSavings, String userName, int accountNumber){
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountChecking = accountSavings;

    }


// setters/getters
    public int getAccountNumber() { return accountNumber; }

    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public double getAccountSavings() {
        return accountSavings;
    }

    public double getAccountChecking() {
        return accountChecking;
    }

    public void setAccountChecking(double amount) {
        this.accountChecking = amount;
    }


    public void setAccountSavings(double accountSavings) {
        this.accountSavings = accountSavings;
    }


    //abstract deposit to be implemented by subclasses
    public abstract double deposit(double amount);

    @Override
    public abstract double withdrawal(double amount);


    public double getCheckingBalance() {
        return 0;
    }

    @Override
    public double fromSavings(double amount) {
        return 0;
    }


    //toString summary

    public String toString(){
        return accountNumber + " " + userName + " "  +
                accountChecking + " " + accountSavings;
    }

    public abstract double getTotalBalance();
}

