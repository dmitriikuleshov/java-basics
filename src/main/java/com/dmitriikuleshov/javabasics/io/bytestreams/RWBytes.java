// Read an array of bytes from the keyboard

package com.dmitriikuleshov.javabasics.io.bytestreams;

import java.io.IOException;


public class RWBytes {

    public static void readBytes() throws IOException {
        byte[] data = new byte[10];

        System.out.println("Enter some characters: ");
        System.in.read(data);
        System.out.print("You entered: ");
        for (byte datum : data) {
            System.out.print((char) datum);
        }
    }

    public static void writeBytes() throws IOException {
        int b;
        b = 'X';
        System.out.write(b);
        System.out.write('\n');
    }
}
