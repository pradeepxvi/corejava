package com.corejava.tryCatchFinally;

public class Main {

    static int test() {
        try {
            System.out.println("Try");
            return 10;
        } finally {
            System.out.println("Finally");
        }
    }

    static int add(int a, int b) {
        try {
            int sum = a + b;
            return sum;
        } catch (Exception e) {
            System.out.println("Error occurred");
            return 0;
        } finally {
            System.out.println("Finally block !!");
        }
    }

    public static void main(String[] args) {
        int num = test();
        System.out.println(num);
        System.out.println("Hello world my name is pradeep Kunwar");

        double[] array = { 1, 2, 3, 4 };
        array[2] = Double.NaN;

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(array[i]);
            } finally {
            }
        }

        try {
            System.out.println("This is first statement");
            int r = 10 / 0;
            System.out.println("result = " + r);
            System.out.println("This is 2nd statement");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Program runs successfully!!!");
    }
}
