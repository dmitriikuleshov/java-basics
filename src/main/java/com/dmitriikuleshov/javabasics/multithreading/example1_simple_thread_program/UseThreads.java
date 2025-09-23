package com.dmitriikuleshov.javabasics.multithreading.example1_simple_thread_program;

public class UseThreads {
    public static void main(String[] args){
        System.out.println("Main thread starting");
        var mt = new MyThread("Child #1");
        var th = new Thread(mt);
        th.start();

        for (int i = 0; i  < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}

class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}