package com.Matthew;

/**
 * Created by Matthew on 4/5/2017.
 */
public class Car extends Vehicle {
    private int gear;

    public Car(String type, int steering, int moving, int gear) {
        super("Car", 1, 10);
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }
}
