package com.corejava.assignment.mybank.bank;

import java.util.Scanner;

public class Main {

    public static int validateSPin() {

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter 4 digit security pin >_ ");
                int data = sc.nextInt();

                if (data >= 1000 && data <= 9999) {
                    return data;
                }
                System.out.println("Invalid security pin ...");
            }
        } finally {
            sc.close();
        }
    }

    public static String validateLength(String name, int lenght) {

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter " + lenght + " digit " + name + " >_ ");
                String data = sc.nextLine();

                if (data.length() == lenght) {
                    return data;
                }
                System.out.println("Invalid " + name + " ...");
            }
        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name >_ ");
        String name = sc.nextLine();

        String contact = validateLength("contact number", 10);

        int sPin = validateSPin();

        Bank bank = new Bank(name, contact, sPin);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("0. Exit");
            System.out.println("1. Get Data");
            System.out.println("2. Depoit");
            System.out.println("3. Withdraw");

            System.out.println();
            System.out.print(">_");
            int option = sc.nextInt();

            if (option == 0) {
                break;
            }

            switch (option) {
                case 1:
                    bank.getData();
                    break;
                case 2:
                    bank.deopsit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}