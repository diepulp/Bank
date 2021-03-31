package com.example.java;

public  abstract class Transactions implements Actions {
    int accountNumber;
    double amount;


    public Transactions( Account accountNumber, double amount){
        getAccountNumber(accountNumber) ;
        this.amount = amount;


    }

    public Transactions(Account accountNum) {
        getAccountNumber(accountNum);
    }

    public int getAccountNumber(Account accountNumber) {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public double fromChecking(double amount) {
        return 0;
    }
}
