package com.dmitriikuleshov.javabasics.generics.example9_ambigulty_errors;

public class MyGenClass<T, V> {
    T ob1;
    V ob2;


    // Both methods are the same erasure

    /*  When your Java code is compiled, all generic
        type information is removed (erased). This means replacing type parameters with their bound
        type, which is Object if no explicit bound is specified, and then applying the appropriate
        casts (as determined by the type arguments) to maintain type compatibility with the types
        specified by the type arguments. The compiler also enforces this type compatibility. This
        approach to generics means that no type parameters exist at run time. They are simply a
        source-code mechanism.
    */

//    void set(T o) {
//        ob1 = o;
//    }
//
//    void set(V o) {
//        ob2 = o;
//    }

    // type erasure effectively reduces both versions to the following : void set(Object o)
}
