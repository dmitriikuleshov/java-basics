package com.dmitriikuleshov.javabasics.multithreading.example4_determining_when_thread_ends;

public class UseIsAlive {
    static void main() {
        System.out.println("Main thread starting");

        var mt1 = MyThread.createAndStart("Child #1");
        var mt2 = MyThread.createAndStart("Child #2");
        var mt3 = MyThread.createAndStart("Child #3");

        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        } while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());

        System.out.println("Main thread ending.");
    }
}

