package com.corejava.methodOverloading;

class Random {

    public Random(int a, int b) {
        System.out.println("sum = " + (a + b));
    }

    public Random(double a, double b) {
        System.out.println("sum = " + (a + b));
    }

    public Random(String a, String b) {
        System.out.println("sum = " + (a + b));
    }
}

class Main {
    public static void main(String[] args) {
        new Random("hello ", "world");
        new Random(1, 2);
    }
}