// Read an array of bytes from the keyboard

package com.dmitriikuleshov.javabasics.io;

import java.io.IOException;


public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        System.out.println("Enter some characters: ");
        System.in.read(data);
        System.out.print("You entered: ");
        for (byte datum : data) {
            System.out.print((char) datum);
        }
    }
}
