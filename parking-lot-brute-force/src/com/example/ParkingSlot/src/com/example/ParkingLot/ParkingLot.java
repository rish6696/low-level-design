package com.example.ParkingLot;

import com.example.Gate.EntryGate;
import com.example.Gate.ExitGate;
import com.example.ParkingSlot.ParkingSlot;
import com.example.Ticket.Ticket;
import com.example.Vehicle.Vehicle;
import com.example.Vehicle.VehicleType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class ParkingLot {

    private LinkedList<ParkingSlot> suvSlotsparkingSlots;
    private LinkedList<ParkingSlot> hatchBackSlots;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;

    int totalSlots;
    int occupiedSlots;

    int ticketId = 1;

    public ParkingLot() {
        this.suvSlotsparkingSlots = new LinkedList<>();
        this.hatchBackSlots = new LinkedList<>();
        this.entryGates = new ArrayList<>();
        this.exitGates = new ArrayList<>();
    }

    public void addSuvSlot(ParkingSlot parkingSlot) {
        this.suvSlotsparkingSlots.add(parkingSlot);
    }

    public void addHatchBackSlot(ParkingSlot parkingSlot) {
        this.suvSlotsparkingSlots.add(parkingSlot);
    }

    public void addEntryGate(EntryGate entryGate) {
        this.entryGates.add(entryGate);
    }

    public void addExitGate(ExitGate exitGate) {
        this.exitGates.add(exitGate);
    }

    public List<EntryGate> getEntryGates() {
        return this.entryGates;
    }

    public List<ExitGate> getExitGates() {
        return this.exitGates;
    }

    private EntryGate getEntryGate(int entryGateId) throws Exception {
        for (EntryGate entryGate : this.entryGates) {
            if (entryGate.getGateId() == entryGateId) {
                return entryGate;
            }
        }
        throw new Exception("Entry Gate not found");
    }

    public Ticket parkVehicle(Vehicle vehicle, int entryGateId) throws Exception {
        // Find Available Slot for this vehicle. 
        // If no slot is available, return null.
        // If slot is available, park the vehicle and return the ticket.
        try {
            ParkingSlot slot;
            if (this.occupiedSlots >= this.totalSlots ){
                throw new Exception("No Slots");
            }

            if (vehicle.getVehicleType() == VehicleType.SUV  &&  ){

                
            }


            
        } catch (NoSuchElementException e) {
            throw new Exception("No parking slot available");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public int unparkVehicle(Vehicle vehicle) {
        // Find the vehicle with the ticket
        // Remove the vehicle from the parking slot
        // Return the parking slot id
        Ticket ticket = vehicle.getTicket();
        ParkingSlot slot = vehicle.getParkingSlot();
        this.parkingSlots.add(slot);

        LocalDateTime entryTime = ticket.getEntryTime();
        int hours = LocalDateTime.now().getHour() - entryTime.getHour();

        int cost = hours * slot.getCostPerHour();
        return cost;
    }

}
