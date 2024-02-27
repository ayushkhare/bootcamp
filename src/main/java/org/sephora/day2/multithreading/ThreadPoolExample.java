package org.sephora.day2.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;

/**
 * A thread pool reuses previously created threads to execute current tasks and offers a solution
 * to the problem of thread cycle overhead and resource thrashing.
 * Since the thread is already existing when the request arrives,
 * the delay introduced by thread creation is eliminated, making the application more responsive.
 */
public class ThreadPoolExample {
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args) {
        // creates five tasks
        var task1 = new Task("task 1");
        var task2 = new Task("task 2");
        var task3 = new Task("task 3");
        var task4 = new Task("task 4");
        var task5 = new Task("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        var pool = Executors.newFixedThreadPool(MAX_T);
        pool.execute(task1); // thread 1
        pool.execute(task2); // thread 2
        pool.execute(task3); // thread 3
        pool.execute(task4); // thread 2
        pool.execute(task5); // thread 1
        pool.shutdown();

        /**
         * The runnables that are run by a particular thread are executed sequentially.
         */
    }
}

class Task implements Runnable {
    private String name;

    public Task(String s) {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    var d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - " + name + " = " + ft.format(d));
                    //prints the initialization time for every task
                } else {
                    var d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " +
                            name + " = " + ft.format(d));
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
