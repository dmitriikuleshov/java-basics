package com.dmitriikuleshov.javabasics.io;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.45;
        boolean b = true;

        try (var dataOut = new DataOutputStream(new FileOutputStream("testData"))) {
            System.out.println("Writing "  + i);
            dataOut.writeInt(i);

            System.out.println("Writing " + d);
            dataOut.writeDouble(d);

            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);

            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException e) {
            System.out.println("Write error");
            return;
        }

        System.out.println();

        try (var dataIn = new DataInputStream(new FileInputStream("testData"))) {
            i = dataIn.readInt();
            System.out.println("Reading " + i);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);

            b = dataIn.readBoolean();
            System.out.println("Reading " + b);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);

        } catch (IOException e) {
            System.out.println("Read error");
        }
    }
}

//Writing 10
//Writing 1023.56
//Writing true
//Writing 90.28
//
//Reading 10
//Reading 1023.56
//Reading true
//Reading 90.28