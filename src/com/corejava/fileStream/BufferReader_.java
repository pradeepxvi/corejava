package com.corejava.fileStream;

import java.io.*;

public class BufferReader_ {
    public static void main(String[] args) {

        try (
                BufferedReader readFile = new BufferedReader(new FileReader("src/file/hello.txt"));
                BufferedWriter writeFile = new BufferedWriter(new FileWriter("src/file/world.txt"));) {

            String line;
            while ((line = readFile.readLine()) != null) {
                writeFile.write(line);
                writeFile.write("\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}