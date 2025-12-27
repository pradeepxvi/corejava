package com.corejava.multithreading.anonymousThread;

public class CoolThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                System.out.println("Sleeping...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            } finally {
                System.out.println("Woke up !!!");
            }
        });
        t.start();

        System.out.println(t.getState());
        Thread.sleep(1000);
        System.out.println(t.getState());
        t.interrupt();
        Thread.sleep(5000);
        System.out.println(t.getState());
    }
}