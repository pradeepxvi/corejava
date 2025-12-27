package com.corejava.inheritance.college;

public class Main {
    public static void main(String[] args) {

        String faculties[] = { "BCA", "BBA", "BE", "BE ELX", "MSC" };
        College college = new College("OCEM", "Gaidakot", "Engineering", faculties);

        college.getCollegeDetails();
        college.getFacuties();

        Teacher teacher = new Teacher("OCEM",
                "Gaidakot",
                "Engineering",
                faculties,
                "John DOe",
                "Nepal",
                "Maths",
                1234.56,
                30);

        System.out.println();
        System.out.println();
        teacher.getCollegeDetails();
        System.out.println();
        System.out.println();
        teacher.getTeacherDeatils();

        Student student = new Student(
                "OCEM",
                "Gaidakot",
                "Engineering",
                faculties,
                "Abyss Poudel",
                "Pokhara",
                20,
                15,
                2,
                90.56,
                4567.88,
                "BCA");

        student.getStudentDetails();
        System.out.println();
        student.getCollegeDetails();
    }
}