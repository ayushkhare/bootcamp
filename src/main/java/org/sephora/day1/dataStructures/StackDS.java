package org.sephora.day1.dataStructures;

import java.util.Stack;

public class StackDS {
     public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Java");
        stack.push("is");
        stack.push("awesome!");

        // Print the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Pop elements from the stack
        String popped1 = stack.pop();
        String popped2 = stack.pop();

        // Print the popped elements
        System.out.println("Popped elements: " + popped1 + ", " + popped2);

        // Print the stack after popping
        System.out.println("Stack after popping elements: " + stack);
    }
}
