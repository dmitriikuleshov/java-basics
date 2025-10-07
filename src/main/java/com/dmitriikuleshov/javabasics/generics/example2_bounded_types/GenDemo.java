package com.dmitriikuleshov.javabasics.generics.example2_bounded_types;

class Pair<T, V extends T> {
    T first;
    V second;

    Pair(T a, V b) {
        first = a;
        second = b;
    }
}

class NumericFns<T extends Number> {

    T num;

    NumericFns(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Wildcard argument specified with ? sign
    // Here, NumericFns<?> matches any type of NumericFns object, allowing any two
    // NumericFns objects to have their absolute values compared.
    boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }
}

public class GenDemo {

    static void main() {
        NumericFns<Integer> iOb =
                new NumericFns<Integer>(5);

        System.out.println("Reciprocal of iOb is "+
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is "+
                iOb.fraction());
    }

}
