package com.example.java;

public class Mutual extends Account {
    private double totalBalance;
    private double savingsBalance;
    private double checkingBalance;

    public Mutual(int accountNumber, String userName, double accountChecking,
                   double accountSavings){
        super(accountNumber, userName, accountNumber);
        this.savingsBalance = accountSavings;
        this.checkingBalance = accountChecking;
    }

    public void setTotalBalance(double accountSavings, double accountChecking) {
        totalBalance = accountChecking + accountSavings;
    }

    public double getTotalBalance() {
        return savingsBalance + checkingBalance;
    }

    @Override
    public double getSavingsBalance() {
        return savingsBalance;
    }
// transfers
    @Override
    public double fromChecking(double amount) {
        checkingBalance -= amount;
        savingsBalance += amount;
        return checkingBalance;

    }
//transfers
    @Override
    public double fromSavings(double amount) {
        savingsBalance -= amount;
        checkingBalance += amount;
        return savingsBalance;
    }


    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
//deposits
    @Override
    public double deposit(double amount) {
        setSavingsBalance(getSavingsBalance() + amount);
        return savingsBalance;
    }
//withdrawal
    @Override
    public double withdrawal(double amount) {
        setSavingsBalance(getSavingsBalance() - amount);
        return savingsBalance;
    }


}
