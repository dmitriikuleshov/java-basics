package com.dmitriikuleshov.javabasics.method_references.example2_instance_methods;

interface IntPredicate {
    boolean test(int n);
}

class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class MethodRefDemo {
    static void main() {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        // result = myNum.isFactor(3);

        ip = myNum2::isFactor;
        result = ip.test(3);
        // result = myNum2.isFactor(3);
    }
}

/////////////////////////////////////////////////////////

interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}

class MethodRefDemo2 {
    static void main() {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);


        /*
        * Here, the name of the class is used instead of a specific object, even though an instance method
        is specified. With this form, the first parameter of the functional interface method matches
        the invoking object and the second parameter matches the parameter (if any) specified by
        the instance method.
        * */
        MyIntNumPredicate inp = MyIntNum::isFactor;

        result = inp.test(myNum, 3);
    }
}

/*
* A method reference can use the keyword super to refer to a superclass version
of a method. The general forms of the syntax are super::methodName and
typeName.super::methodName. In the second form, typeName must refer to
the enclosing class or a superinterface.
* */

