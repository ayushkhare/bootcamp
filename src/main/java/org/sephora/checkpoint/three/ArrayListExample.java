package org.sephora.checkpoint.three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // To create an ArrayList from another collection using the ArrayList(Collection c)constructor.
        // How to add all the elements from an existing collection to the new ArrayList using the addAll()method.

        // Create an existing collection
        Collection<Integer> existingCollection = List.of(1, 2, 3, 4, 5);

        // Create a new ArrayList from the existing collection using the constructor
        ArrayList<Integer> newList = new ArrayList<>(existingCollection);

        // Display the new ArrayList
        System.out.println("New ArrayList from existing collection: " + newList);

        // Create another existing collection
        Collection<Integer> anotherCollection = List.of(6, 7, 8);

        // Add all elements from the existing collection to the new ArrayList using addAll() method
        newList.addAll(anotherCollection);

        // Display the new ArrayList after adding elements
        System.out.println("ArrayList after adding elements: " + newList);
    }
}
