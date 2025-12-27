package com.corejava.fileStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// parent classs of input file input/output stream ,working with bytes
// import java.io.InputStream; 
// import java.io.OutputStream;

// Reading binary data - Images, audio, videos, PDFs
// import java.io.FileInputStream;
// import java.io.FileOutputStream;

// import java.io.Reader;
// import java.io.Writer;

//Reading text files - convert bytes → characters
// import java.io.FileReader;
// import java.io.FileWriter;

// Why use it? // Reads line by line // Much faster // Wraps around FileReader 
// import java.io.BufferedReader;
// import java.io.BufferedWriter;

// import java.io.File;

public class ReadFile {
    public static void main(String[] args) {

        try (BufferedReader file = new BufferedReader(new FileReader("src/file/hello.txt"))) {
            // int data;
            // while ((data = file.read()) != -1) {
            // System.out.print((char) data);
            // }
            file.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
