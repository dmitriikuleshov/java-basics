package com.dmitriikuleshov.javabasics.generics.example6_generic_interfaces;

// A generic containment interface.
// This interface implies that an implementing
// class contains one or more values.
public interface Containment<T> {
    boolean contains(T o);
}