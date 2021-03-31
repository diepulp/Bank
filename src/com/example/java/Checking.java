package com.example.java;

public class Checking extends Account  {

    double checkingBalance;


    public Checking(String userName, int accountNumber, double checkingBalance) {
        super(userName, accountNumber, checkingBalance);
        this.checkingBalance = checkingBalance;
    }



    @Override
    public double deposit(double amount) {
        setCheckingBalance(getSavingsBalance() + amount);
        return checkingBalance;
    }

    @Override
    public double withdrawal(double amount) {
        setCheckingBalance(getSavingsBalance() - amount);
        return checkingBalance;
    }


    @Override
    public double getSavingsBalance() {
        return checkingBalance;
    }

    @Override
    public double fromChecking(double amount){
        return 0;
    }

    @Override
    public double fromSavings(double amount) {
        return 0;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }


    public String toString(){
        return getUserName() + " " + getCheckingBalance() + " " + getAccountNumber();
    }

    @Override
    public double getTotalBalance() {
        return 0;
    }
}

