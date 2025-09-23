package com.dmitriikuleshov.javabasics.multithreading.example7_synchronized_statements;

class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}

class SumArray {
    private int sum;

    int sumArray(int[] nums) {  // Here sumArray is not synchronized.
        sum = 0; // reset sum
        for (int num : nums) {
            sum += num;
            System.out.println("Running total for " +
                    Thread.currentThread().getName() +
                    " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    static SumArray sa = new SumArray();
    int[] nums;
    int answer;
    Thread thrd;

    MyThread(String name, int[] nums) {
        thrd = new Thread(this,  name);
        this.nums = nums;
    }

    public static MyThread createAndStart(String name, int[] nums) {
        MyThread myThread = new MyThread(name, nums);
        myThread.thrd.start();
        return myThread;
    }


    @Override
    public void run() {
        synchronized (sa) {
            answer = sa.sumArray(nums);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}

