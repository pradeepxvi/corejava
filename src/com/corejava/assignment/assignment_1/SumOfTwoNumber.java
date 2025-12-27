package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class SumOfTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ente first number:");
        int num1 = sc.nextInt();

        System.out.print("Ente second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
        sc.close();

    }
}