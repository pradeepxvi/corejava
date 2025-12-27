package com.corejava.fileStream.ByteStream;

import java.io.*;
import java.util.Scanner;

public class BufferByteStrem {
    public static void main(String[] args) {
        try (
                BufferedOutputStream writter = new BufferedOutputStream(new FileOutputStream("src/file/write.txt"));
                BufferedInputStream reader = new BufferedInputStream(new FileInputStream("src/file/write.txt"));
                Scanner sc = new Scanner(System.in)) {

            System.err.println("Enter text to wite in file :");
            String text = sc.nextLine();

            writter.write(text.getBytes());
            writter.flush();

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print(data);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
