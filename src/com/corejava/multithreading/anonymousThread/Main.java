package com.corejava.multithreading.anonymousThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is opened...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            } finally {
                System.out.println("Thread 1 is closed...");
            }
        });
        t1.start();

        new Thread(() -> {
            System.out.println("Thread 2 is opened...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            } finally {
                System.out.println("Thread 2 is closed...");
            }
        }).start();
    }
}
