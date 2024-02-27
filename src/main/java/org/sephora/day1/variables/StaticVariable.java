package org.sephora.day1.variables;

public class StaticVariable {

    public static String name = "I am a static variable"; // static variable declaration

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Static variable args = " + args[i]); // can be accessed directly without creating instance
        }

        System.out.println("Static variable = " + StaticVariable.name); // can be accessed directly without creating instance
    }
}
