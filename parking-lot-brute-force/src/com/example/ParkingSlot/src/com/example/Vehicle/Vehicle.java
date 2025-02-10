package com.example.Vehicle;

import com.example.ParkingSlot.ParkingSlot;
import com.example.Ticket.Ticket;

public abstract class Vehicle {

    private VehicleType vehicleType;
    private String licensePlate;
    private String color;
    private String model;
    private String year;
    private Ticket ticket;
    private ParkingSlot parkingSlot;

    public Vehicle(VehicleType vehicleType, String licensePlate, String color, String model, String year) {
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
        this.color = color;
        this.model = model;
        this.year = year;
        this.ticket = null;
        this.parkingSlot = null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return this.ticket;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
    public ParkingSlot getParkingSlot() {
        return this.parkingSlot;
    }

    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
}
