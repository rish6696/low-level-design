package com.example.ParkingSlot;

public class CarSlot extends ParkingSlot {

    private int costPerHour;

    public CarSlot(int slotId) {
        super(slotId);
        this.costPerHour = 20;
    }

    @Override
    public int getCostPerHour() {
        return this.costPerHour;
    }
}
