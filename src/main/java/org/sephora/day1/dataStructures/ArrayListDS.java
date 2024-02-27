package org.sephora.day1.dataStructures;
import java.util.ArrayList;

public class ArrayListDS {

    public static void main(String[] args) {
        // Do's
        // 1. Declare ArrayList with a specific type to ensure type safety
        ArrayList<String> fruits = new ArrayList<>();
        
        // 2. Add elements using add() method
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // 3. Access elements using get() method
        System.out.println("Fruit at index 1: " + fruits.get(1));
        
        // 4. Check if the ArrayList is empty before performing operations
        if (!fruits.isEmpty()) {
            // 5. Iterate over elements using for-each loop or iterator
            for (String fruit : fruits) {
                System.out.println("Fruit: " + fruit);
        
                // fruits.remove(fruit); //This will result in a ConcurrentModificationException
                // System.out.println("Found the fruit: " + fruit);
            }
        }
        
        // Don'ts
        // 1. Avoid using raw type for ArrayList
        // ArrayList fruits = new ArrayList(); // Raw type, not recommended
        
        // 2. Don't add elements of different types
        // fruits.add(123); // This will result in a compilation error
        
        // 3. Avoid unnecessary manual resizing
        // fruits.ensureCapacity(100); // Unnecessary unless you know you'll be adding a large number of elements
        
        // 4. Don't explicitly set size unless necessary
        // fruits.size(); // Avoid setting size manually, ArrayList resizes dynamically
        
        // 5. Avoid using ArrayList for primitive types
        // Use specialized collections like IntArrayList from libraries such as Apache Commons Collections
        
        // 6. Avoid frequent removals in the middle of the list
        // Removing elements in the middle of an ArrayList is relatively expensive as it requires shifting subsequent elements
        // if you need to perform frequent removals, consider using a LinkedList instead of an ArrayList,
        //  as LinkedList performs better for such operations since it doesn't require shifting elements when removing from the middle of the list.

        // 7. Don't mix ArrayList with synchronized code blocks for thread safety
        // For thread safety, use Collections.synchronizedList() or CopyOnWriteArrayList
        
    }
}
