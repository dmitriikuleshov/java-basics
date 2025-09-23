package com.dmitriikuleshov.javabasics.multithreading.example4_determining_when_thread_ends;

public class UseJoin {
    static void main() {
        System.out.println("Main thread starting.");
        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");

        try {
            mt1.join();
            System.out.println("Child #1 joined");
            mt2.join();
            System.out.println("Child #2 joined");
            mt3.join();
            System.out.println("Child #3 joined");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread ending.");
    }
}
