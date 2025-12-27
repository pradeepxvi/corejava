package com.corejava.fileStream.ByteStream;

import java.io.*;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {

        try (FileOutputStream writter = new FileOutputStream("src/file/write.txt");
                Scanner sc = new Scanner(System.in)) {

            System.err.println("Enter text to wite in file :");
            String text = sc.nextLine();

            writter.write(text.getBytes());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
