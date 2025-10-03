package com.dmitriikuleshov.javabasics.static_import;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// import static java.lang.Math.* // to import all methods


public class Quadratic {
    static void main() {
        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        x = (-b + sqrt(pow(b, 2)) - 4 * a * c) / (2 * a);
        System.out.println("First solution: " + x);

        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
