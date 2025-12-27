package com.corejava.assignment.mybank.account;

import com.corejava.assignment.mybank.bank.Bank;

class MyAccount extends Bank {

    private String accountType;

    public MyAccount(String accountType, String name, String contact, int pin) {

        super(name, contact, pin);
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void getData() {
        System.out.println("Account Type: " + this.accountType);
        super.getData();
    }

    void getName() {
        System.out.println("Name" + super.customerName);
    }
}
