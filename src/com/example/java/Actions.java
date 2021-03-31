package com.example.java;
// Interface
public interface  Actions {

    double deposit(double amount);

    double withdrawal(double amount);

    double getCheckingBalance();

    double getSavingsBalance();

    double fromChecking(double amount);

    double fromSavings(double amount);
}
