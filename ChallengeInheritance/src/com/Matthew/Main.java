package com.Matthew;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Car", 1, 50);

        Car car = new Car("Car", 1, 40, 6);

        Impala impala = new Impala("Car", 1, 60, 6, "Impala", 4);
        impala.accel();
        impala.decel();
        impala.carDoors();
    }
}
