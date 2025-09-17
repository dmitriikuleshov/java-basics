package com.dmitriikuleshov.javabasics.io.bytestreams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        try (var raf = new RandomAccessFile("random.dat", "rw")) {
            for (double datum : data) {
                raf.writeDouble(datum);
            }

            raf.seek(0); // Seek first double
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // Seek second double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 2); // Seek third double
            d = raf.readDouble();
            System.out.println("Third value is " + d);

            // without seeking it automatically sets to next value after reading
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
