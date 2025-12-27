package com.corejava.multithreading.types;

// thread
class HelloHello extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " stopped !!!");
        }
    }
}

// runnable
class WorldWorld implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting...");
        try {
            // Thread.currentThread().join(); // deadlock waits for its own end
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " stopped !!!");
        }
    }
}

public class WaysOfCreatingThread {
    public static void main(String[] args) throws InterruptedException {

        // define object of extendable thread
        HelloHello thread1 = new HelloHello();
        thread1.setName("First Thread");

        Thread thread2 = new Thread(new WorldWorld());
        thread2.setName("Last Thread");

        thread1.start();
        thread1.join();
        thread2.start();

        // thread2.join();
    }
}
