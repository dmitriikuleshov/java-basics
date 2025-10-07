package com.dmitriikuleshov.javabasics.generics.example3_bounded_wildcards;

public class UseBoundedWildcard {

    // Takes as a parameter only objects of class A or a subclass of A
    static void test(Gen<? extends A> o) {
        // ...
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

// Does not extend A
class D {
}

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }
}

