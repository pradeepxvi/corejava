package com.corejava.multithreading.waitnotify;

class Product {

    private int data;
    private boolean hasData = false;

    public synchronized void produce(int d) throws InterruptedException {
        while (hasData) {
            wait(); // wait until consumer consumes
        }

        data = d;
        hasData = true;
        System.out.println("Produced : " + data);

        notify(); // wake consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait(); // wait until producer produces
        }

        System.out.println("Consumed : " + data);
        hasData = false;

        notify(); // wake producer
    }
}

class Producer extends Thread {

    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                product.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}

class Consumer extends Thread {

    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                product.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Product product = new Product();

        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);

        producer.start();
        consumer.start();
    }
}
