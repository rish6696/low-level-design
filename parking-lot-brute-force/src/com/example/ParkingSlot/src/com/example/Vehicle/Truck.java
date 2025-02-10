package com.example.Vehicle;

public class Truck extends Vehicle {

    public Truck(String licensePlate, String color, String model, String year) {
        super(VehicleType.TRUCK, licensePlate, color, model, year);
    }
}
