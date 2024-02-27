package org.sephora.day1.casting;

/**
 * Done manually by the programmer
 * If we do not perform casting then the compiler reports compile-time error
 */

// double -> float -> long -> int -> char -> short -> byte
public class ExplicitCasting {

    public static void main(String[] args) {
        double d = 166.66;
//        long l = (long) d;
        long l = (long) d;
        int i = (int) l;

        System.out.println("Before conversion, double value = " + d);
        System.out.println("After conversion, long value = " + l);
        System.out.println("After conversion, int value = " + i);

        // uncomment below lines to see compile-time error
        // long l = d
        // int error = l;
    }
}
