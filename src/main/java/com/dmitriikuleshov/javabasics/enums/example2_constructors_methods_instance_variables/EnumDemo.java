package com.dmitriikuleshov.javabasics.enums.example2_constructors_methods_instance_variables;

enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(700), BOAT(22);

    private final int speed;

    Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }

}

public class EnumDemo {
    static void main(String[] args) {
        Transport tp;

        System.out.println("Typical speed for an airplane is " +
                Transport.AIRPLANE.getSpeed() +
                " miles per hour.\n");

        System.out.println("All Transport speeds: ");
        for(Transport t : Transport.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }

}
