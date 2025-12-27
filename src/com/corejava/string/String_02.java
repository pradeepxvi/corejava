package com.corejava.string;

class String_02 {
    public static void main(String[] args) {

        String fistName = "pradeep ";
        String middleName = "jung ";
        String lastName = "kunwar ";

        String fullName = fistName + middleName + lastName;
        System.out.println("full name  = " + fullName);
        System.out.println("full name  = " + fistName.concat(middleName).concat(lastName));

    }
}