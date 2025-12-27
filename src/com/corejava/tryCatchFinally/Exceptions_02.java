package com.corejava.tryCatchFinally;

import java.io.*;

public class Exceptions_02 {

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void fileMethod() {

        // FileNotFoundException
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/file/llo.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            // file.close can thow IOException | NullPointerException I
            if (file != null) {
                try {
                    file.close();
                } catch (IOException | NullPointerException e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }
        }
    }

    public static void main(String[] args) {

        try {
            int result = divide(1, 0);
            System.out.println("result = " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            fileMethod();
        }
        System.out.println("This is the end");

    }
}
