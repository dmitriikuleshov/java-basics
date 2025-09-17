/*
Try This 10-1

Compare two files.

To use this program, specify the names
of the files to be compared on the command line.

java CompFile FIRST.TXT SECOND.TXT
*/

package com.dmitriikuleshov.javabasics.io;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }
        try (var f1 = new FileInputStream(args[0]); var f2 = new FileInputStream(args[1])) {
            int bytes1, bytes2;
            do {
                bytes1 = f1.read();
                bytes2 = f2.read();
                if (bytes1 != bytes2) {
                    System.out.println("Files differ");
                    return;
                };
            } while(bytes1 != -1 && bytes2 != -1);

            System.out.println("Files are the same");


        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
