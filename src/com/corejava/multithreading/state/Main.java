package com.corejava.multithreading.state;

class HelloThread extends Thread {

    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " sleeeping......");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " sleeping over");
        }

    }

}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        HelloThread helloThread = new HelloThread("Hello Thread");

        System.out.println(helloThread.getName() + " = " + helloThread.getState());
        System.out.println(Thread.currentThread().getName() + " = " + Thread.currentThread().getState());
        helloThread.start();
        System.out.println(helloThread.getName() + " after start =  " + helloThread.getState());

        Thread.sleep(1000);
        System.out.println(helloThread.getName() + " after start =  " + helloThread.getState()); // TIMED_WAITING

    }

}

// ------------------()--()()()()-100----------()----------------------
// main>>------start>running--------__________------------------------->end
// --------------------------------300
// hello>>>>>>>>>>>>>start>running>______________________________--->end