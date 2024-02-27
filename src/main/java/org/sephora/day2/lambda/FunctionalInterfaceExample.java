package org.sephora.day2.lambda;

public class FunctionalInterfaceExample {

    int side = 5;
    Square square = side -> side * side; // What will happen if Square has more than 1 abstract method?
}

@FunctionalInterface
interface Square {
    int area(int side);

    // cannot add more than 1 abstract methods
//    void hello();

    // can add with default implementation though
//    default void hello() {
//        System.out.println("Hello");
//    }
}
