package org.sephora.day2.exception.exercise;

import java.io.IOException;

/**
 * Create a custom exception class called InvalidAgeException that inherits from Exception clas
 * <p>
 * Create another class that has a method called "validate()"
 * that validates the age of a user and throws InvalidAgeException if (age < 18)
 * If InvalidAgeException is throws, your code should handle that exception
 */

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class TestException {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        var testException = new TestException();
        try {
            testException.validate(15);
        } catch (InvalidAgeException exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }
        System.out.println("rest of the code...");
    }
}
