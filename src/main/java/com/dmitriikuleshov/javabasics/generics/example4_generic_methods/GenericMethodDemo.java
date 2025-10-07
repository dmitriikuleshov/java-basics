package com.dmitriikuleshov.javabasics.generics.example4_generic_methods;

public class GenericMethodDemo {

    // V extends T is used to enforce that method can be called
    // only with arguments that are comparable with each other
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false;
            }
        }

        return true;
    }
}
