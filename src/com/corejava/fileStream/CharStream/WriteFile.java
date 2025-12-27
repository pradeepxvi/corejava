package com.corejava.fileStream.CharStream;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {

        try (FileWriter writter = new FileWriter("src/file/write.txt")) {

            String textToWrite = "Hello world, this text is writte by FileWriter";
            writter.write(textToWrite);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
