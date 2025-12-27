package com.corejava.multithreading.join;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CollectData ct = new CollectData();
        ct.start();
        ct.join();

        DownloadData downloadThread = new DownloadData(ct.name, ct.college, ct.faculty);
        downloadThread.start();
        downloadThread.join();
        System.out.println(downloadThread.name);
    }
}
