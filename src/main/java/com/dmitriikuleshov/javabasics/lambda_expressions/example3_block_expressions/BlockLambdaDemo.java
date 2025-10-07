package com.dmitriikuleshov.javabasics.lambda_expressions.example3_block_expressions;

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    static void main() {
        NumericFunc smallestF = n -> {
            int result = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i <= n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));
    }
}
