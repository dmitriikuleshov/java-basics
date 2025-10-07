package com.dmitriikuleshov.javabasics.lambda_expressions.example2;

interface NumericTest {
    boolean test(int n, int m);
}

interface StringTest {
    boolean test(String aStr, String bStr);
}

public class LambdaDemo {
    static void main() {

        // NumericTest

        NumericTest isFactor = (n, d) -> (n % d) == 0;

        NumericTest lessThan = (n, m) ->(n < m);

        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);


        // StringTest

        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        StringTest isIn1 = (a, b) -> a.contains(b);
        StringTest isIn2 = String::contains;


    }
}



