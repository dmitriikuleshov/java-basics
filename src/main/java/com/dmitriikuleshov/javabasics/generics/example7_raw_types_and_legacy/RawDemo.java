package com.dmitriikuleshov.javabasics.generics.example7_raw_types_and_legacy;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

public class RawDemo {
    static void main() {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Create a raw-type Gen object and give it
        // a Double value.
        Gen raw = new Gen(98.6);
        double d = (Double) raw.getOb();


        // The use of a raw type can lead to run-time.
        // exceptions. Here are some examples.

        // The following cast causes a run-time error!
        // int i = (Integer) raw.getOb(); // run-time error


        // This assignment overrides type safety.
        // strOb = raw; // OK, but potentially wrong
        // String str = strOb.getOb(); // run-time error

        // This assignment also overrides type safety.
        // raw = iOb; // OK, but potentially wrong
        // d = (Double) raw.getOb(); // run-time error
    }
}
