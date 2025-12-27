package com.corejava.tryCatchFinally;

class Exceptions_01 {

    public static void main(String[] args) {

        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        System.out.println("Hello Guys");

        try {
            try {
                try {
                    int result = 5 / 0;
                    System.out.println("result = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot prform division by 0");
                }

                System.out.println("array[50] = " + array[50]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index 50 is out of boud");
            }
            System.out.println("array[5] = " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 5 is out of boud");
        }
        System.out.println("Bye Guys");
    }
}