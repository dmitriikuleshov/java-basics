package com.dmitriikuleshov.javabasics.generics.example1_simple_generics;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}


class GenDemo {
    static void main() {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value: " + str);

        // Gen<int> intOb = new Gen<int>(53); // Error, can't use primitive type
    }
}