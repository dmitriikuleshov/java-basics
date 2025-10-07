package com.dmitriikuleshov.javabasics.lambda_expressions.example7_exceptions_within_lambda;

import java.io.*;

// without "throws IOException" code won't compile
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

public class LambdaExceptionDemo {
    static void main() {
        MyIOAction myIO = rdr -> {
            int ch = rdr.read();
            return true;
        };
    }
}
