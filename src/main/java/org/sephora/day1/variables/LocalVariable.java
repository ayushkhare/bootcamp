package org.sephora.day1.variables;

public class LocalVariable {

    public static void main(String[] args) {
        int number1 = 10; // java 8
        var number2 = 12; // java 17
        System.out.println("Local Vairable = " + number1);
        System.out.println("Local Vairable = " + number2);
    }
}
