package com.corejava.fileStream.ByteStream;

import java.io.*;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream("src/file/write.txt")) {

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((byte) data);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
