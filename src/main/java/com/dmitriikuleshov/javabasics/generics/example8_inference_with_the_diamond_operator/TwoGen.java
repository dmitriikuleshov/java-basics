package com.dmitriikuleshov.javabasics.generics.example8_inference_with_the_diamond_operator;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2 ) {
        ob1 = o1;
        ob2 = o2;
    }

    boolean isSame(TwoGen<T, V> o) {
        return ob1 == o.ob1 && ob2 == o.ob2;
    }
}

class Main {

    static void main() {
        // Before JDK7
        TwoGen<Integer, String> tgOb = new TwoGen<Integer, String>(42, "Testing");

        // Possible since JDK7 (diamond operator)
        TwoGen<Integer, String> tgOb1 = new TwoGen<>(42, "Testing");

        // Possible since JDK10
        var tgOb2 = new TwoGen<Integer, String>(42, "Testing");

        if (tgOb.isSame(new TwoGen<>(42, "Testing"))) System.out.println("Same");
    }
}
