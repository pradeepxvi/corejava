package com.corejava.inheritance;

class Teacher {
    String subject;
    String course;
    int id;

    public Teacher(String subject, String course, int id) {
        this.subject = subject;
        this.course = course;
        this.id = id;
    }

    public void getData() {
        System.out.println("Subject = " + this.subject);
        System.out.println("Course = " + this.course);
        System.out.println("ID = " + this.id);
    }
}

class Java extends Teacher {

    String name;

    public Java(String name, String subject, String course, int id) {
        super(subject, course, id);
        this.name = name;
    }

    public void getData() {
        System.out.println("Name = " + this.name);
        super.getData();
    }
}

class DSA extends Java {
    public DSA(String name, String subject, String course, int id) {
        super(name, subject, course, id);
    }
}

public class Main {
    public static void main(String[] args) {

        DSA dsa = new DSA("Siva Sir", "OOP", "Stack", 2);
        dsa.getData();
    }
}