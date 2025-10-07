package com.dmitriikuleshov.javabasics.generics.example10_generic_restrictions;

class Gen<T> {

}

/*


public class Wrong1<T> {
    T ob;
    Wrong1() {
        // Wrong, T is simply a placeholder
        ob = new T();
    }
}


// No static member can use a type parameter declared by enclosing class
class Wrong2<T> {
    // Wrong, no static variables of type T.
    static T ob;
    // Wrong, no static method can use T.
    static T getOb() {
        return ob;
    }
}

class Wrong3<T extends Number> {
    T ob;
    T[] vals; // OK
    Gen(T o, T[] nums) {
        ob = o;
        // This statement is illegal.
        vals = new T[10]; // can't create an array of T
        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array
    }
}




class GenArrays {
    public static void main(String[] args) {
        Integer[] n = { 1, 2, 3, 4, 5 };
        Gen<Integer> iOb = new Gen<Integer>(50, n);
        // Can't create an array of type-specific generic references.
        // Gen<Integer>[] gens = new Gen<Integer>[10]; // Wrong!
        // This is OK.
        Gen<?>[] gens = new Gen<?>[10]; // OK
    }
}


// A generic class cannot extend Throwable. This means that you cannot create generic
// exception classes.


 */