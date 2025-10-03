package com.dmitriikuleshov.javabasics.autoboxing;

public class ManuallyBox {
    static void main() {

        // 'Integer(int)' is deprecated since version 9 and marked for removal
        // Integer iOb = new Integer(100);
        // Integer iOb = new Integer.valueOf(100);

        Integer iOb = 100; // Autobox int
        // Unnecessary unboxing
        // int i = iOb.intValue();
        int i = iOb; // Autounbox int

        // Autounbox in expressions
        double j = iOb * 20.4;

        int x = 100;
        someMethod(x); // autoboxing parameter
    }

    static void someMethod(Integer x) {
        System.out.println(x);
    }

    static Integer return100() {
        return 100; // autoboxing
    }
}
