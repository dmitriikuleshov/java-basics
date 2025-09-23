package com.dmitriikuleshov.javabasics.io.characterstreams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToFile {
    public static void main(String[] args) {
        String str;
        var br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Enter text ('stop' to quit)");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
