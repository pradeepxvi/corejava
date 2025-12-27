package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        sc.close();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("factorial  = " + fact);
    }
}