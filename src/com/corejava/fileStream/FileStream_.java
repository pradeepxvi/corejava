package com.corejava.fileStream;

import java.io.*;

class FileStream_ {

    // try-catch
    // public static void method1() throws FileNotFoundException {
    // FileInputStream is = new FileInputStream("src/file/hello.txt");
    // int data;
    // try {
    // while ((data = is.read()) != -1) {
    // System.out.println((char) data);
    // }
    // } catch (IOException e) {
    // System.out.println(e);
    // } finally {
    // if (is != null) {
    // try {
    // is.close();
    // } catch (IOException e) {
    // System.out.println(e);
    // }
    // }
    // }
    // }

    // try-catch-resources
    public static void method1() throws FileNotFoundException {

        try (FileInputStream is = new FileInputStream("src/file/hello.txt");) {
            int data;
            while ((data = is.read()) != -1) {
                // System.out.print((byte) data);
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        try {
            method2();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("This is the end");
    }
}