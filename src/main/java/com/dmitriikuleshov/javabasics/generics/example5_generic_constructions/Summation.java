package com.dmitriikuleshov.javabasics.generics.example5_generic_constructions;


// A constructor can be generic even if its class is not
public class Summation {
    private int sum;

    <T extends Number> Summation(T arg) {
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}
