package org.sephora.day1.dataStructures;

public class ArraysDS {
    public static void main(String[] args) {
        // Do's
        
        // 1. Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // 2. Access elements using index
        System.out.println("First element: " + numbers[0]);
        
        // 3. Iterate over array elements
        System.out.print("Array elements:");
        for (int num : numbers) {
            System.out.print(" " + num);
        }
        System.out.println();
        
        // 4. Use array length to determine the size
        System.out.println("Array length: " + numbers.length);
        
        // Don'ts
        
        // 1. Avoid accessing elements beyond array bounds
        // System.out.println(numbers[5]); // This will result in an ArrayIndexOutOfBoundsException
        
        // 2. Don't assign values to array elements beyond array bounds
        // numbers[5] = 6; // This will result in an ArrayIndexOutOfBoundsException
        
        // 3. Avoid using raw type for arrays
        // Object[] array = new Object[10]; // Raw type, not recommended
        
        // 4. Don't add elements of different types to an array
        // numbers[0] = "one"; // This will result in a compilation error
        
        // 5. Avoid using Arrays.toString() for deep arrays
        // int[][] matrix = {{1, 2}, {3, 4}};
        // System.out.println(Arrays.toString(matrix)); // This will print hash codes
        
        // 6. Don't manually resize arrays
        // Arrays are fixed-size; create a new array and copy elements if resizing is needed
        
        // 7. Avoid using arrays when dynamic resizing is required
        // Use ArrayList or other resizable collections instead
        
        // 8. Don't use arrays for parallel operations or concurrent access
        // Use concurrent collections or synchronization if required
    }
}
