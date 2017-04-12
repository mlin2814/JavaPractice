package com.Matthew;

/**
 * Created by Matthew on 4/5/2017.
 */
public class Impala extends Car {
    private String model;
    private int doors;

    public Impala(String type, int steering, int moving, int gear, String model, int doors ) {
        super(type, steering, 10, 6);
        this.model = model;
        this.doors = doors;
    }

    private void changeGears(){
        System.out.println("You changed gears!");
    };

    public void accel(){
        System.out.println("This vehicle is accelerating");
        speed(60);
    }

    public void decel(){
        System.out.println("This vehicle is decelerating");
        speed(20);
    }

    public void carDoors(){
        doors = 4;
        System.out.println("This vehicle has " + doors + " doors. Uncommon in this vehicle style");
    }
}
