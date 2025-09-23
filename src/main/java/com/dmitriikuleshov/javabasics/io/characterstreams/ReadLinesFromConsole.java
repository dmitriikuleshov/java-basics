package com.dmitriikuleshov.javabasics.io.characterstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLinesFromConsole {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        String str;

        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.strip().equalsIgnoreCase("stop"));
    }
}
