package org.sephora.day1.dataStructures;

import java.util.HashSet;
import java.util.Set;

public class SetDS {
    public static void main(String[] args) {
         // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Adding a duplicate, which will be ignored
        
        System.out.println("\nSet Example:");
        System.out.println("Elements in the set: " + set);
    }
}
