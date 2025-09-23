package com.dmitriikuleshov.javabasics.multithreading.example5_thread_priorities;

import java.util.Arrays;
import java.util.List;

class Priority implements Runnable {
    int count;
    Thread  thrd;

    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");

        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10_000_000); // This first thread to 10_000_000 stops all threads
        stop = true;
    }
}

public class PriorityDemo {
    static void main() {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        Priority mt3 = new Priority("Normal Priority #1");
        Priority mt4 = new Priority("Normal Priority #2");
        Priority mt5 = new Priority("Normal Priority #3");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        List<Priority> threadList = Arrays.asList(mt1, mt2, mt3, mt4, mt5);
        for (var thread : threadList) {
            thread.thrd.start();
        }

        try {
            for (var thread : threadList) {
                thread.thrd.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nHigh priority thread counted to " +
                mt1.count);
        System.out.println("Low priority thread counted to " +
                mt2.count);
        System.out.println("1st Normal priority thread counted to " +
                mt3.count);
        System.out.println("2nd Normal priority thread counted to " +
                mt4.count);
        System.out.println("3rd Normal priority thread counted to " +
                mt5.count);
    }
}
