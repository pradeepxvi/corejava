package com.corejava.multithreading.join;

public class DeadLock extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting ....");
        try {
            System.out.println(threadName + " sleeping for 1 sec..");
            Thread.sleep(1000);

            System.out.println(threadName + " is waiting for end of " + threadName + " ...");
            Thread.currentThread().join();// waits for its own end
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thread is woke up..");
        }

    }

    public static void main(String[] args) {

        DeadLock dl = new DeadLock();
        dl.start();

    }
}
