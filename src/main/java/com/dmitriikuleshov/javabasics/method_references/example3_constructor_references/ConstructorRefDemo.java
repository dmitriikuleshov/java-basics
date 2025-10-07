package com.dmitriikuleshov.javabasics.method_references.example3_constructor_references;

interface MyFunc {
    MyClass func(String s);
}

class MyClass {
    private String str;

    MyClass(String s) {
        str = s;
    }

    MyClass() {
        str = "";
    }

    String getStr() {
        return str;
    }
}

public class ConstructorRefDemo {
    static void main() {
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func("Testing");
    }
}

//////////////////////////////////////////////////////////


// First parameter in function is always number of elements being created
interface MyClassArrayCreator {
    MyClass[] func(int n);
}

interface MyArrayCreator<T> {
    T[] func(int n);
}

class ConstructorRefDemo1 {
    static void main() {
        MyClassArrayCreator mcArrayCons = MyClass[]::new;
        MyClass[] a = mcArrayCons.func(3);
        for(int i=0; i < 3; i++)
            a[i] = new MyClass(i+"");


        MyArrayCreator<MyClass> myArrayCreator = MyClass[]::new;
        MyClass[] myClasses = myArrayCreator.func(5);
    }
}