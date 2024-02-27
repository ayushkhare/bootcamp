package org.sephora.day1.dataStructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDS {
     public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.add("D");

        // Queue difference between offer and add functions? 
        //  - both add elements to the queue, but offer returns false if it fails to add the element
        //  - add throws an IllegalStateException if it fails to add the element
        //  - offer will not throw error if the queue is full, but add will throw an error if the queue is full

        // Display the queue
        System.out.println("Queue: " + queue);

        // Peek: Retrieve but does not remove the head of the queue
        String peekElement = queue.peek();
        System.out.println("Peek Element: " + peekElement);

        // Poll: Retrieve and remove the head of the queue
        String polledElement = queue.poll();
        System.out.println("Polled Element: " + polledElement);
        
        // Display the queue after polling
        System.out.println("Queue after polling: " + queue);

        // Size: Get the number of elements in the queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Queue empty? " + isEmpty);

         // LinkedList as a Queue
        Queue<Integer> linkedListQueue = new LinkedList<>();

        linkedListQueue.offer(9);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);

        System.out.println("LinkedList Queue: " + linkedListQueue);

        // ArrayDeque as a Queue
        int capacity = 2; // Initial capacity of the ArrayDeque, but it can grow dynamically as needed
        ArrayDeque<Integer> arrayDequeQueue = new ArrayDeque<>(capacity);

        arrayDequeQueue.offer(4);
        arrayDequeQueue.offer(5);
        arrayDequeQueue.offer(6);
        arrayDequeQueue.add(7);
        arrayDequeQueue.offer(8);
        

        System.out.println("ArrayDeque Queue: " + arrayDequeQueue);
        System.out.println("ArrayDeque Queue size: " + arrayDequeQueue.size());

        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(9);
        priorityQueue.offer(8);
        priorityQueue.offer(7);

        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
