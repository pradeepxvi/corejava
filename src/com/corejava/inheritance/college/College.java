package com.corejava.inheritance.college;

public class College {

    String collegeName;
    String collegeAddress;
    String collegeType;
    String[] faculties;

    public College(String collegeName, String collegeAddress, String collegeType, String[] faculties) {

        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
        this.collegeType = collegeType;
        this.faculties = new String[faculties.length];

        for (int i = 0; i < faculties.length; i++) {
            this.faculties[i] = faculties[i];
        }
    }

    public void getFacuties() {
        for (String faculty : this.faculties) {
            System.out.println(faculty);
        }
    }

    public void getCollegeDetails() {
        System.out.println("College Name " + this.collegeName);
        System.out.println("College Address " + this.collegeAddress);
        System.out.println("College Type " + this.collegeType);

        System.out.println("Faculties :");
        for (String faculty : this.faculties) {
            System.out.println("    " + faculty);
        }
    }

}