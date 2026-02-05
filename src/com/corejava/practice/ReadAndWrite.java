package com.corejava.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("src/files/temp1.txt");
                FileWriter writter = new FileWriter("src/files/temp2.txt")) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writter.write(ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
