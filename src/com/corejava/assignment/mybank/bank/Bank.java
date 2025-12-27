package com.corejava.assignment.mybank.bank;

import java.util.Scanner;

public class Bank {

    protected String customerName;
    protected String accountNumber;
    protected double balance;
    protected String contact;
    protected int securityPin;

    public Bank(String customerName, String contact, int securityPin) {
        this.customerName = customerName;
        this.contact = contact;
        this.accountNumber = contact;
        this.balance = 0.0;
        this.securityPin = securityPin;
    }

    private boolean authenticated() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Security Pin >_ ");
        int pin = sc.nextInt();
        sc.close();

        if (pin != this.securityPin) {
            System.out.println("Incorrect Pin....");
            return false;
        }
        return true;
    }

    protected void getData() {

        if (!authenticated())
            return;

        System.out.println();
        System.out.println("Customer Name  " + this.customerName);
        System.out.println("Contact number  " + this.contact);
        System.out.println("Accouunt number  " + this.accountNumber);
        System.out.println("Bank balance  $" + this.balance);
        System.out.println();
    }

    public double withdraw() {
        System.out.println();

        if (!authenticated())
            return -1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw >_ $");
        double amount = sc.nextDouble();
        sc.close();

        if (amount > this.balance) {
            System.out.println("Not sufficient fund...");
            return -1;
        }
        if (amount < 100) {
            System.out.println("Withdraw at least $100...");
            return -1;
        }
        this.balance -= amount;
        System.out.println("Withdraw successful $" + amount);
        System.out.println();
        return this.balance;
    }

    public double deopsit() {
        System.out.println();

        if (!authenticated())
            return -1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit >_ $");
        double amount = sc.nextDouble();
        sc.close();

        if (amount < 100) {
            System.out.println("Deposit at least $100...");
            return -1;
        }
        this.balance += amount;
        System.out.println("Deposit successful $" + amount);
        System.out.println();
        return this.balance;
    }
}