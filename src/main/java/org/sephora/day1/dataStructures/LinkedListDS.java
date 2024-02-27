package org.sephora.day1.dataStructures;

import java.util.LinkedList;

public class LinkedListDS {
    public static void main(String[] args) {
        // Do's
        // 1. Declare LinkedList with a specific type to ensure type safety
        LinkedList<String> colors = new LinkedList<String>();
        
        // 2. Add elements using add() method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        // 3. Access elements using get() method or iteration
        System.out.println("First color: " + colors.getFirst());
        System.out.println("Last color: " + colors.getLast());
        
        // 4. Check if the LinkedList is empty before performing operations
        if (!colors.isEmpty()) {
            // 5. Iterate over elements using for-each loop or iterator
            for (String color : colors) {
                System.out.println("Color: " + color);
            }
        }
        
        // Don'ts
        // 1. Avoid using raw type for LinkedList
        // LinkedList colors = new LinkedList(); // Raw type, not recommended
        
        // 2. Don't add elements of different types
        // colors.add(123); // This will result in a compilation error
        
        // 3. Avoid unnecessary manual resizing
        // LinkedList does not require manual resizing
        
        // 4. Don't explicitly set size unless necessary
        // colors.size(); // Avoid setting size manually, LinkedList resizes dynamically
        
        // 5. Avoid using LinkedList for frequent random access by index
        // LinkedList is slower for random access compared to ArrayList
        
        // 6. Avoid mixing LinkedList with synchronized code blocks for thread safety
        // For thread safety, use Collections.synchronizedList() or other thread-safe collections
    }
}
