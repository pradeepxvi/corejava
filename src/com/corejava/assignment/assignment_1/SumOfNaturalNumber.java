package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class SumOfNaturalNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ente  number:");
        int num = sc.nextInt();
        int sum = (num * (num + 1)) / 2;

        System.out.println();
        System.out.println("Sum = " + sum);

        sc.close();
    }
}