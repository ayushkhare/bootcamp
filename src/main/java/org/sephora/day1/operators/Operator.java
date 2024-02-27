package org.sephora.day1.operators;

public class Operator {

    public static void main(String[] args) {
        int a = 12, b = 5;

        System.out.println("----- Start arithmetic operators -----");
        arithmeticOperator(a, b);
        System.out.println("----- End arithmetic operators -----");

        System.out.println();

        System.out.println("----- Start assignment operators -----");
        assignmentOperator(b);
        System.out.println("----- End assignment operators -----");

        System.out.println();

        System.out.println("----- Start relational operators -----");
        relationalOperator(a, b);
        System.out.println("----- End relational operators -----");

        System.out.println();

        System.out.println("----- Start logical operators -----");
        logicalOperator();
        System.out.println("----- End logical operators -----");

        System.out.println();

        System.out.println("----- Start unary operators -----");
        unaryOperator(a, b);
        System.out.println("----- End unary operators -----");

        System.out.println();

        System.out.println("----- Start ternary operators -----");
        ternaryOperator(a, b);
        System.out.println("----- End ternary operators -----");

        System.out.println();
    }

    private static void arithmeticOperator(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    private static void assignmentOperator(int a) {
        int var = a;
        System.out.println("assign using =: " + var);
        var += a; // var = var + a
        System.out.println("assign using +=: " + var);
        var *= a; // var =  var * a
        System.out.println("assign using *=: " + var);
    }

    public static void relationalOperator(int a, int b) {
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
    }

    public static void logicalOperator() {
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 > 3) && (8 < 5));
        System.out.println((5 < 3) || (8 > 5));
        System.out.println((5 > 3) || (8 < 5));
        System.out.println((5 < 3) || (8 < 5));
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));
    }

    public static void unaryOperator(int a, int b) {
        int result1, result2;
        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);
        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);
    }

    public static void ternaryOperator(int a, int b) {
//        if (a == b) {
//
//        } else {
//
//        }

        String result = (a == b) ? "values are equal" : "values are not equal";
        System.out.println("result = " + result);
    }
}
