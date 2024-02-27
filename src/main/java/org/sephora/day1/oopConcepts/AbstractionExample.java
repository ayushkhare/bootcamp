package org.sephora.day1.oopConcepts;

// https://www.geeksforgeeks.org/four-main-object-oriented-programming-concepts-of-java/?ref=lbp

public class AbstractionExample {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.stop();
    }
}

class Honda extends Car {
    @Override
    public void stop() {
        System.out.println("Honda stop");
    }
}

// Java 8
abstract class Car {
    public abstract void stop(); // class that extends this abstract class need to implement all the abstract methods
}

// Java 17
final class Audi extends SealedCar {

    @Override
    public void stop() {

    }
}

// Compile-time error
final class Mercedes extends SealedCar {

    @Override
    public void stop() {

    }
}

sealed abstract class SealedCar {
    public abstract void stop();
}

