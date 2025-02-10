package com.example.Vehicle;

public class Car extends Vehicle {

    public Car(String licensePlate, String color, String model, String year) {
        super(VehicleType.CAR, licensePlate, color, model, year);
    }

}
