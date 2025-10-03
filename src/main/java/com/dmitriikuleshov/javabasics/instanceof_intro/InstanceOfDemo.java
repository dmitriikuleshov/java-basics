package com.dmitriikuleshov.javabasics.instanceof_intro;

public class InstanceOfDemo {
    static void main() {
        Alpha alpha = new Alpha();
        Beta beta = new Beta();
        Gamma gamma = new Gamma();

        // instanceof succeeds when the object is the same
        // type as the specified type.
        if(alpha instanceof Alpha)
            System.out.println("alpha is instance of Alpha");
        if(beta instanceof Beta)
            System.out.println("beta is instance of Beta");
        if(gamma instanceof Gamma)
            System.out.println("gamma is instance of Gamma");



        // instanceof succeeds when the object is the same
        // type as the specified type.
        if(beta instanceof Alpha)
            System.out.println("beta is also instance of Alpha");
        if(gamma instanceof Alpha)
            System.out.println("gamma is also instance of Alpha");


        alpha = beta;

        if (alpha instanceof Beta) {
            System.out.println("alpha can be cast to Beta");
        }

        if (alpha instanceof Gamma) {
            // This won't execute
            gamma = (Gamma) alpha;
        }
    }
}


class Alpha {
    // ...
}

class Beta extends Alpha {
    // ...
}

class Gamma extends Alpha {
    // ...
}