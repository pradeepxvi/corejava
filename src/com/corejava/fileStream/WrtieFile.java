package com.corejava.fileStream;

import java.io.*;

public class WrtieFile {
    public static void main(String[] args) {

        // file stream reader/writter
        // try (FileOutputStream out = new FileOutputStream("src/file/sitamam.txt");
        // FileInputStream write = new FileInputStream("src/file/sitamam.txt")) {
        // String dat = "Sita mam is my favourite teacher , xd";
        // out.write(dat.getBytes());

        // int data;
        // while ((data = write.read()) != -1) {
        // System.out.print((byte) data);
        // }
        // } catch (IOException e) {
        // System.out.println(e);
        // }

        // file reader/writter
        try (FileWriter writter = new FileWriter("src/file/sitamam.txt");) {

            String dataTOWrite = "Hello world boom";
            writter.write(dataTOWrite);

        } catch (IOException e) {
            System.out.print("failed to write");
        }

        try (FileReader reader = new FileReader("src/file/sitamam.txt")) {

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("failed to write");
        }

    }
}
