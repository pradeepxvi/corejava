package com.corejava.tryCatchFinally;

import java.util.Scanner;

public class TryWithResources {

    public static void takeInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number:");
            int data = sc.nextInt();
            System.out.println("data = " + data / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the end of method...");
        }

    }

    public static void main(String[] args) {
        takeInput();
        System.out.println("This is the end of main method...");
    }
}