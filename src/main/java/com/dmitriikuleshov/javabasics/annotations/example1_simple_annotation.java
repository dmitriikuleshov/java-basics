package com.dmitriikuleshov.javabasics.annotations;

// Automatically extends the Annotation interface
@interface MyAnnotation {

    // Methods declaration
    String str();
    int val();

    // We don't provide  bodies for these methods
    // Java implements these methods
    // Moreover, methods act much like fields
}

// can annotate everything
@MyAnnotation(str = "", val = 10)
class Main {
    @MyAnnotation(str = "Annotation example", val = 100)
    void someMethod() {
        System.out.println("hello world");
    }
}