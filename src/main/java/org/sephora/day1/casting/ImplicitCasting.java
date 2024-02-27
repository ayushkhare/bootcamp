package org.sephora.day1.casting;

/**
 * Both data types must be compatible with each other
 * The target type must be larger than the source type
 */
// byte -> short -> char -> int -> long -> float -> double
public class ImplicitCasting {

    public static void main(String[] args) {
        int x = 10;
        long y = x;
        float z = y;
        System.out.println("Before conversion, int value = " + x);
        System.out.println("After conversion, long value = " + y);
        System.out.println("After conversion, float value = " + z);
    }
}
