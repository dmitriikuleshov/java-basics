package com.dmitriikuleshov.javabasics.io.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


// Open file and use file in separate try catch blocks
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // 1) Open File
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        // 2) Use File
        // Better approach is to close file within finally block
        // The file is going to be closed in any case
        // Even if an unexpected error occurs
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}

// Open file and use file in single try catch block
class ShowFile1 {
    public static void main(String[] args) {
        int i;
        // Initialize fin to null
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }


        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}


// try-with-resources (since JDK 7)
class ShowFile2 {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try (var fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}