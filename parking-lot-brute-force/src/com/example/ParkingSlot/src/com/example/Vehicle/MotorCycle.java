package com.example.Vehicle;

public class MotorCycle extends Vehicle {

    public MotorCycle(String licensePlate, String color, String model, String year) {
        super(VehicleType.MOTORCYCLE, licensePlate, color, model, year);
    }
}