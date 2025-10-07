package com.dmitriikuleshov.javabasics.lambda_expressions.example1_single_expression;


// functional interface (specifies only one method)
// static, private, default methods are not abstract, so it's possible to also use them
// along with one abstract method
interface MyAnyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class Main {
    static void main() {

        // implementation of the abstract method defined by the functional interface
        // that specifies its target type
        MyAnyValue myVal = () -> 98.6;

        MyAnyValue val;
        val = () -> 98.6;

        MyParamValue parVal = (d) -> 1 / d;
        MyParamValue parVal1 = (double d) -> 1 / d;
        MyParamValue parVal2 = (var d) -> 1 / d;
    }
}
