package com.corejava.multithreading.join;

public class CollectData extends Thread {
    public String name;
    public String college;
    public String faculty;

    @Override
    public void run() {
        System.out.println("Collectin information....");
        try {
            Thread.sleep(2000);
            name = "Hello world";
            college = "Hello world";
            faculty = "Hello world";
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Information collected...");
        }
    }
}
