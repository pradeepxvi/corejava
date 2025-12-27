package com.corejava.cunstructorOverloading;

class Random {
    int a;
    int b;

    double da;
    double db;

    String str1;
    String str2;

    public Random(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Random(double da, double db) {
        this.da = da;
        this.db = db;
    }

    public Random(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    int sum() {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Random r = new Random(1, 2);

        System.out.println("sum = " + r.sum());

    }
}