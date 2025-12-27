package com.corejava.inheritance.college;

public class Student extends College {

    String studentName;
    String studentAddress;
    int studentAge;
    int studentClass;
    int studentRollNo;
    double studentPercentage;
    double studentFees;
    String faculty;

    public Student(
            String collegeName,
            String collegeAddress,
            String collegeType,
            String[] faculties,
            String studentName,
            String studentAddress,
            int studentAge,
            int studentClass,
            int studentRollNo,
            double studentPercentage,
            double studentFees,
            String faculty) {
        super(collegeName, collegeAddress, collegeType, faculties);
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentClass = studentClass;
        this.studentRollNo = studentRollNo;
        this.studentPercentage = studentPercentage;
        this.studentFees = studentFees;
        this.faculty = faculty;
    }

    public void getStudentDetails() {
        System.out.println("Student Name " + this.studentName);
        System.out.println("Student Address " + this.studentAddress);
        System.out.println("Student Age " + this.studentAge);
        System.out.println("Student Class " + this.studentClass);
        System.out.println("Student RollNo " + this.studentRollNo);
        System.out.println("Student Percentage " + this.studentPercentage);
        System.out.println("Student Fees " + this.studentFees);
        System.out.println("Student Faculty " + this.faculty);
    }
}