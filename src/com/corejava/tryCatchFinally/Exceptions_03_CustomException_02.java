package com.corejava.tryCatchFinally;

class InsufficientFundException extends Exception {
    String name;
    double amount;

    InsufficientFundException(String message, String name, double amount) {
        super(message);
        this.name = name;
        this.amount = amount;
    }

    public void getDetails() {
        System.out.println(this.name + " you have only " + this.amount);
    }
}

class Bank {

    String name;
    private double balance;

    public Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getAmount() {
        return this.balance;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > this.balance) {
            throw new InsufficientFundException("Insufficient amount", this.name, this.balance);
        }
        this.balance -= amount;
        System.out.println("new balance = " + this.balance);
    }

}

public class Exceptions_03_CustomException_02 {
    public static void main(String[] args) {

        Bank bank = new Bank("John Doe", 100.00);

        try {
            bank.withdraw(1001);
        } catch (InsufficientFundException e) {
            System.out.println(e);
            e.getDetails();
        }
        System.out.println("This is the end");
    }

}
