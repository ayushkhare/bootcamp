package org.sephora.day2.multithreading.communication;

/**
 * Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
 * <p>
 * There are two types of thread synchronization mutual exclusive and inter-thread communication.
 * <p>
 * 1.Mutual Exclusive
 * Synchronized method.
 * Synchronized block.
 * Static synchronization.
 * <p>
 * 2.Cooperation (Inter-thread communication in java)

/**
 * Understanding the problem without synchronization
 */
class Table {
    void printTable(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i); // 5*1, 5*2,... / 100*1, 100*2
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThreadA extends Thread {
    Table t;
    MyThreadA(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }

}

class MyThreadB extends Thread {
    Table t;
    MyThreadB(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();//only one object
        var tA = new MyThreadA(obj);
        var tB = new MyThreadB(obj);
        tA.start();
        tB.start();
    }
}