package com.corejava.assignment.assignment_1;

import java.util.Scanner;

class Fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        sc.close();

        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 0; i < num - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}