package com.corejava.fileStream.CharStream;

import java.io.*;
import java.util.Scanner;

public class BufferCharStream {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file/write.txt"));
                Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter text to write:");

            String text = sc.nextLine();

            writer.write(text);

            writer.newLine();
            writer.write(text);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src/file/write.txt"))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            System.out.println(reader.readLine());

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
