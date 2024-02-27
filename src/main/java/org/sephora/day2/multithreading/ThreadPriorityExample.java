package org.sephora.day2.multithreading;

/**
 * Default priority of a thread is 5 (NORM_PRIORITY).
 * The value of MIN_PRIORITY is 1 and,
 * the value of MAX_PRIORITY is 10.
 */
public class ThreadPriorityExample extends Thread {
    @Override
    public void run() {
        System.out.println("Running thread name is:" + Thread.currentThread().getName());
        System.out.println("Running thread priority is:" + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        var example1 = new ThreadPriorityExample();
        var example2 = new ThreadPriorityExample();
        example1.setPriority(Thread.MIN_PRIORITY);
        example2.setPriority(Thread.MAX_PRIORITY);
        example1.start();
        example2.start();
    }
}
