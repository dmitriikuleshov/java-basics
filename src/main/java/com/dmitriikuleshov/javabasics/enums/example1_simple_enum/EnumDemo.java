package com.dmitriikuleshov.javabasics.enums.example1_simple_enum;

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
    static void main() {
        var tp = Transport.AIRPLANE;
        printTransport(tp);
        System.out.println();
        showTransportValues();
        System.out.println();
        showValue();
    }

    static void printTransport(Transport tp) {
        switch(tp) {
            case CAR:
                System.out.println("CAR");
                break;
            case TRUCK:
                System.out.println("TRUCK");
                break;
            case AIRPLANE:
                System.out.println("AIRPLANE");
                break;
            case TRAIN:
                System.out.println("TRAIN");
            case BOAT:
                System.out.println("BOAT");
        }
    }

    static void showTransportValues() {
        Transport[] allTransports = Transport.values();
        for (var t: allTransports) {
            System.out.println(t);
        }
    }

    static void showValue() {
        var tp = Transport.valueOf("AIRPLANE");
        System.out.println(tp);
    }
}
