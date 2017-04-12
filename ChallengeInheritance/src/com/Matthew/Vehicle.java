package com.Matthew;

/**
 * Created by Matthew on 4/5/2017.
 */
public class Vehicle {
    private String type;
    private int steering;
    private int moving;

    public Vehicle(String type, int steering, int moving) {
        this.type = type;
        this.steering = steering;
        this.moving = moving;
    }

    public void speed (int mph){
        System.out.println("Vehicle is moving at " + mph + " mph!");
    }

    public String getType() {
        return type;
    }

    public int getSteering() {
        return steering;
    }

    public int getMoving() {
        return moving;
    }
}
