package com.example.java;

public class Savings extends Account  {

    double savingsBalance;

    public Savings(){}

    public Savings(double accountSavings, String userName, int accountNumber) {
        super(accountSavings, userName, accountNumber);
        savingsBalance = accountSavings;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    @Override
    public double fromChecking(double amount) {
        return 0;
    }

    @Override
    public double fromSavings(double amount) {
        return 0;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

// deposit to savings account

    public double deposit(double amount) {
       setSavingsBalance(getSavingsBalance() + amount);
        return savingsBalance;
    }
// withdrawal from savings

    @Override
    public double withdrawal(double amount) {
        setSavingsBalance(getSavingsBalance() - amount);
        return savingsBalance;
    }

    private void setSavingsBalance() {
    }
    public String toString(){
        return getSavingsBalance() + getUserName();
    }

    @Override
    public double getTotalBalance() {
        return 0;
    }

}
