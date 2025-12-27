package com.corejava.fileStream.CharStream;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("src/file/write.txt")) {

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
