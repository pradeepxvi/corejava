package com.corejava.multithreading.join;

public class DownloadData extends Thread {

    String name;
    String college;
    String faculty;

    public DownloadData(String name, String college, String faculty) {
        this.name = name;
        this.college = college;
        this.faculty = faculty;
    }

    @Override
    public void run() {
        System.out.println("Downloading information....");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Information Downloaded...");
        }
    }
}
