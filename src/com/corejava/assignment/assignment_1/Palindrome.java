package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        sc.close();

        int og = num;

        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println((rev == og) ? "Palindrome" : "Not a Palindrome");

    }
}