package com.corejava.fileStream;

import java.io.*;

public class ReadWrite {

    public static void main(String[] args) {

        try (FileInputStream source = new FileInputStream("src/media/video.mp4");
                FileOutputStream destination = new FileOutputStream("src/temp/video.mp4")) {
            int data;
            while ((data = source.read()) != -1) {
                destination.write((byte) data);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
