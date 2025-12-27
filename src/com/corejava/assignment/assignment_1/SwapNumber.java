package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class SwapNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ente first number:");
        int num1 = sc.nextInt();

        System.out.print("Ente second number:");
        int num2 = sc.nextInt();

        System.out.println();
        System.out.println("Before Swapping...");
        System.out.println("num1 = " + num1 + " num2 = " + num2);

        int sum = num1 + num2;
        num1 = sum - num1;
        num2 = sum - num1;

        System.out.println();
        System.out.println("After Swapping...");
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        sc.close();

    }
}