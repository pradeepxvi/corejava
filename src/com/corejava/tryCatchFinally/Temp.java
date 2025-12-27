package com.corejava.tryCatchFinally;

public class Temp {

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("You are poor in maths !!");
        }
        return a / b;
    }

    public static void main(String[] args) throws ArithmeticException {

        try {

            int result = 10 / 0;
            System.out.println("result = " + result);

            try {

                System.out.println("My function = " + divide(10, 0));

                int[] array = { 1, 2, 3 };
                System.out.println("array[10] = " + array[10]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("This is the end");

    }
}