package com.dmitriikuleshov.javabasics.lambda_expressions.example6_variable_capture;

interface MyFunc {
    int func(int n);
}

public class VariableCapture {
    static void main() {
        int num = 10;

        MyFunc myLambda = n -> {
            int v = num + n;

            // illegal
            // num++;

            return v;
        };

        // 18
        System.out.println(myLambda.func(8));
    }
}
