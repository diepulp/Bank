package com.example.java;

//Assignment Final Project: Bank
//Author: Vladimir Ivanov
//Date: March 17, 2021


import java.util.Scanner;


public class Main {

    public static void menu(){
        System.out.println("Enter an account to view:\n1 for Checking" +
                "\n2 for Savings\n3 for Mutual Account");
    }
    public static void format(String a, int b, double c, double d ){
        String format = "(\"USERNAME %15s ACCOUNT # %15s CHECKING ($) %15S SAVINGS ($) " +
                "\\n\", \"\", \"\", \"\",\"\", \"\")";

        for (int i=0; i < format.length()+8; i++){
            System.out.print("-");
        }

        System.out.println();
        System.out.printf("USERNAME %15s ACCOUNT # %15s CHECKING ($) %15S SAVINGS ($) \n", "", "", "","");
        System.out.println();
        System.out.printf("%-9s  %17d %30.1f %30.1f\n", a, b, c,d);


    }



    public static void main(String[] args) {
        int selection;
        Account[] accounts = new Account[5];
        accounts[0] = new Checking("Checking",1, 678.0);
        accounts[1] = new Savings(230, "Savings", 02);
        accounts[2] = new Mutual(03, "Mutual", 400, 500 );

        Scanner console = new Scanner(System.in);
        menu();
        selection = console.nextInt();


            if(selection == 1){
            format(accounts[0].getUserName(),accounts[0].getAccountNumber(), accounts[0].getAccountChecking(), 0);
                System.out.println();

            }else if(selection == 2){

                format(accounts[1].getUserName(),accounts[1].getAccountNumber(), 0,
                        accounts[1].getSavingsBalance());

            }else if(selection == 3){
                int option;
                double amount;

                format(accounts[2].getUserName(),accounts[2].getAccountNumber(), accounts[2].getCheckingBalance(),
                        accounts[2].getSavingsBalance());
                System.out.println();
                System.out.println("Enter\n1 to transfer funds from savings\n" +
                        "2 to transfer funds from checking\n" +
                        "3 to withdraw funds\n" +
                        "4 to deposit funds");
                option = console.nextInt();

                if(option == 1){
                    System.out.println("Enter the amount: ");
                    amount = console.nextDouble();
                    accounts[2].fromSavings(amount);
                    System.out.println( amount + " was transferred from saving to checking " +
                                accounts[2].getSavingsBalance() + " remains in savings");
                    format(accounts[2].getUserName(),accounts[2].getAccountNumber(), accounts[2].getCheckingBalance(),
                            accounts[2].getSavingsBalance());

                }else if (option == 2){
                    System.out.println("Enter the amount to transfer from checking to savings: ");
                    amount = console.nextDouble();
                    accounts[2].fromChecking(amount);
                    System.out.println(amount + " was transferred from checking to savings " +
                            accounts[2].getCheckingBalance() + " remains in checking");
                    format(accounts[2].getUserName(),accounts[2].getAccountNumber(), accounts[2].getCheckingBalance(),
                            accounts[2].getSavingsBalance());
                }else if (option ==3){
                    System.out.println("Enter the amount to withdraw from savings: ");
                    amount = console.nextDouble();
                    accounts[2].withdrawal(amount);
                    System.out.println(amount + " was withdrawn from savings " + accounts[2].getSavingsBalance() +
                            " remains in savings");
                }else if (option == 4){
                    System.out.println("enter the amount to deposit to savings: ");
                    amount = console.nextDouble();
                    accounts[2].deposit(amount);
                    System.out.println(amount + " was deposited to savings "+
                            accounts[2].getSavingsBalance() + " remains in savings");
            }
        }
    }
}
