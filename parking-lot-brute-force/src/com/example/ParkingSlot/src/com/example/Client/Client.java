package com.example.Client;

import com.example.ParkingLot.ParkingLot;
import com.example.Vehicle.Car;
import com.example.Vehicle.Vehicle;

public class Client {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        
        Vehicle vehicle = new Car("1234567890", "Red", "Toyota", "Camry");
    }
}
