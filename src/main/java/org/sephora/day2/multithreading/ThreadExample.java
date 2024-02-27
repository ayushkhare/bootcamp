package org.sephora.day2.multithreading;

/**
 * Different ways of implementing a thread
 * 1. extend Thread class
 * 2. implement Runnable interface
 */
class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started running");
    }

    public static void main(String[] args) {
        var threadExample = new ThreadExample();
        threadExample.start(); // JVM calls the run() method of this thread
    }
}

class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started running1");
    }

    public static void main(String[] args) {
        var runnableExample = new RunnableExample();
        var thread = new Thread(runnableExample); // provide runnable target as parameter
        thread.start(); // JVM calls the run() method of this thread
    }
}

/**
 * Difference between Runnable vs Thread
 *
 * 1.Implementing Runnable is the preferred way to do it.
 * Here, you’re not really specializing or modifying the thread's behavior.
 * You’re just giving the thread something to run. That means composition is the better way to go.
 *
 * 2.Java only supports single inheritance, so you can only extend one class.
 *
 */

/**
 * Difference between start() and run()?
 * 1.When program calls start() method a new Thread is created and code inside run() method is executed in new Thread
 *
 * 2.if you call run() method directly no new Thread is created and code inside run() will execute
 * on current Thread.
 */
