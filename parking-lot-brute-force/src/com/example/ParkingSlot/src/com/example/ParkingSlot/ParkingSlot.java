package com.example.ParkingSlot;



public abstract class ParkingSlot {

    private int slotId;
    private boolean isOccupied;

    public abstract int getCostPerHour();


    public ParkingSlot(int slotId) {
        this.slotId = slotId;
        this.isOccupied = false;
    }
}
