package com.dmitriikuleshov.javabasics.multithreading.example6_synchronized_methods;


public class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}

class SumArray {
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0; // reset sum

        for (int num : nums) {
            sum += num;
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;
    // Construct a new thread.
    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }
    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name, int[] nums) {
        MyThread myThrd = new MyThread(name, nums);
        myThrd.thrd.start(); // start the thread
        return myThrd;
    }
    // Entry point of thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() +
                " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}
