package com.dmitriikuleshov.javabasics.method_references.example1_static_methods;


interface IntPredicate {
    boolean test(int n);
}

class MyIntPredicates {
    // A static method that returns true if a number is prime.
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

public class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    void main(String[] args)
    {
        boolean result;
        // Here, a method reference to isPrime is passed to numTest().
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result) System.out.println("17 is prime.");
        // Next, a method reference to isEven is used.
        result = numTest(MyIntPredicates::isEven, 12);
        if(result) System.out.println("12 is even.");
        // Now, a method reference to isPositive is passed.
        result = numTest(MyIntPredicates::isPositive, 11);
        if(result) System.out.println("11 is positive.");
    }
}