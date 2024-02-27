package org.sephora.day1.dataStructures;
import java.util.Vector;
public class VectorDS {

    public static void main(String[] args) {
        // Do's
        // 1. Declare Vector with a specific type to ensure type safety
        Vector<String> names = new Vector<>();
        
        // 2. Add elements using add() method
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // 3. Access elements using get() method
        System.out.println("First name: " + names.get(0));
        
        // 4. Check if the Vector is empty before performing operations
        if (!names.isEmpty()) {
            // 5. Iterate over elements using for-each loop or iterator
            for (String name : names) {
                System.out.println("Name: " + name);
            }
        }
        
        // Don'ts
        // 1. Avoid using raw type for Vector
        // Vector names = new Vector(); // Raw type, not recommended
        
        // 2. Don't add elements of different types
        // names.add(123); // This will result in a compilation error
        
        // 3. Avoid unnecessary manual resizing
        // Vector does not require manual resizing
        
        // 4. Don't explicitly set size unless necessary
        // names.setSize(10); // Avoid setting size manually, Vector resizes dynamically
        
        // 5. Avoid using Vector for new code
        // Use ArrayList instead unless you specifically need thread-safe operations
        
        // 6. Avoid using Vector in new code due to its synchronized nature
        // Synchronization can lead to performance overhead
        
        // 7. Don't use Vector for frequent random access by index
        // Vector is slower for random access compared to ArrayList
        
    }
    
}
