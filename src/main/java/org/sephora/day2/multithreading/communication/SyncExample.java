package org.sephora.day2.multithreading.communication;

/**
 * Synchronized method is used to lock an object for any shared resource.
 * <p>
 * When a thread invokes a synchronized method, it automatically acquires the lock for that object
 * and releases it when the thread completes its task.
 */
class SyncTable {
    synchronized void printTable(int n) { //method synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * synchronization block
     */
    void printTableBlockStyle(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    /**
     * Problem without static synchronization
     * Suppose there are two objects of a shared class (e.g. Table) named obj1 and obj2
     * In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4
     * because t1 and t2 both refers to a common object that have a single lock.
     * But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock
     * and t3 acquires another lock. We don't want interference between t1 and t3 or t2 and t4.
     * Static synchronization solves this problem.
     * static synchronization
     */
    synchronized static void printTableStaticStyle(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    SyncTable t;

    MyThread1(SyncTable t) {
        this.t = t;
    }

    public void run() {
//        t.printTable(5);
//        t.printTableBlockStyle(5);
        SyncTable.printTableStaticStyle(5);
    }

}

class MyThread2 extends Thread {
    SyncTable t;

    MyThread2(SyncTable t) {
        this.t = t;
    }

    public void run() {
//        t.printTable(100);
//        t.printTableBlockStyle(100);
        SyncTable.printTableStaticStyle(100);
    }
}

class TestSynchronization2 {
    public static void main(String[] args) {
        var obj = new SyncTable(); //only one object
        var obj1 = new SyncTable();

        var t3 = new MyThread1(obj);
        var t4 = new MyThread2(obj1);


        t3.start();
        t4.start();
    }
}


