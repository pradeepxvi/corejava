package com.corejava.inheritance.college;

public class Teacher extends College {

    String teacherName;
    String teacherAddress;
    String teacherSubject;
    double teacherSalary;
    int teacherAge;

    public Teacher(
            String collegeName,
            String collegeAddress,
            String collegeType,
            String[] faculties,
            String teacherName,
            String teacherAddress,
            String teacherSubject,
            double teacherSalary,
            int teacherAge) {
        super(collegeName, collegeAddress, collegeType, faculties);
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.teacherSubject = teacherSubject;
        this.teacherSalary = teacherSalary;
        this.teacherAge = teacherAge;
    }

    public void getTeacherDeatils() {
        System.out.println("Name " + this.teacherName);
        System.out.println("Address " + this.teacherAddress);
        System.out.println("Subject " + this.teacherSubject);
        System.out.println("Salary " + this.teacherSalary);
        System.out.println("Age " + this.teacherAge);
    }

}