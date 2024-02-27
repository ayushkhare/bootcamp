package org.sephora.day1.oopConcepts.exercise;

/**
 * Indentity vs Equality
 */
public class Exercise1 {
    private final String s1 = "Java";
    private final String s2 = "Java";

    public void output() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va"); // Java
        System.out.println(s1 == s2); // ? t
        System.out.println(s1.equals(s2)); // ? t
        System.out.println(sb1.toString() == s1); // ? f
        System.out.println(sb1.toString().equals(s1)); // ? t
    }

    public static void main(String[] args) {
        var exercise = new Exercise1();
        exercise.output();
    }
}
