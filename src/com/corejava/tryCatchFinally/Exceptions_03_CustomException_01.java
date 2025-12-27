package com.corejava.tryCatchFinally;

// class InvalidAgeException extends RuntimeException {
//     InvalidAgeException(String message) {
//         super(message);
//     }
// }

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Exceptions_03_CustomException_01 {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Age must be between 0 to 100");
        }
        System.out.println("Age checked");
    }

    public static void main(String[] args) {

        try {
            checkAge(-10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hello world");
    }
}