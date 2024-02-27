package org.sephora.day2.multithreading.exercise;

/**
 * Options: 1. One thread created 2. Two thread created 3. Depend upon system 4. No thread created
 *
 */
public class Exercise1 extends Thread {

    public void run() {
        System.out.println("run");
    }

//    /**
//     * Question 1
//     */
//    static class MyClass {
//        public static void main(String[] args) {
//            var thread = new Exercise1();
//            thread.start();
//        }
//    }

    /**
     * Options: 1. One thread created 2. Two thread created 3. Depend upon system 4. No thread created
     */
//    /**
//     * Question 2
//     */
    static class MyClass2 {
        public static void main(String[] args) {
            var thread = new Exercise1();
            thread.run();
        }
    }
}
