package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class SumOfNEvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        sc.close();

        int count = 0;
        int number = 0;
        int sum = 0;

        while (count < num) {
            count++;
            number += 2;
            sum += number;
        }

        System.out.println("\nSum = " + sum);
    }
}