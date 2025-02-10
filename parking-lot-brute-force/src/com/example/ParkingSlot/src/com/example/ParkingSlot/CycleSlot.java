package com.example.ParkingSlot;

public class CycleSlot extends ParkingSlot {

    private int costPerHour;

    public CycleSlot(int slotId) {
        super(slotId);
        this.costPerHour = 10;
    }

    @Override
    public int getCostPerHour() {
        return this.costPerHour;
    }
}
