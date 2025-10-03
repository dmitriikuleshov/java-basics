package com.dmitriikuleshov.javabasics.enums.example3_enumerations_inherit_enum;

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
    static void main() {
        Transport tp, tp2, tp3;

        for (var t: Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        if (tp.compareTo(tp2) < 0)
            System.out.println(tp + " comes before " + tp2);
        else if (tp.compareTo(tp2) > 0)
            System.out.println(tp + " comes before " + tp2);

        if (tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
    }
}
