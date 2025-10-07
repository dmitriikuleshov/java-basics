package com.dmitriikuleshov.javabasics.lambda_expressions.example4_generic_functional_interfaces;

interface SomeTest<T> {
    boolean test(T n, T m);
}

public class GenericFunctionalInterfaceDemo {
    static void main() {
        SomeTest<Integer> isFactor = (n,d) -> (n % d) == 0;

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        SomeTest<String> isIn = String::contains;


    }
}
