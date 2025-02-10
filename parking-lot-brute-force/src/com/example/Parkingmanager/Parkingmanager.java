package com.example.Parkingmanager;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;

import com.example.Car.Car;
import com.example.Car.Type;
import com.example.Ticket.Ticket;

public class Parkingmanager {
    HashMap<Type, Integer> rates;
    HashMap<Type, Integer> count;

    public Parkingmanager(int suvSlots, int hatchBackSlots) {

        this.rates = new HashMap<>();
        this.count = new HashMap<>();

        count.put(Type.HATCHBACK, hatchBackSlots);
        count.put(Type.SUV, suvSlots);

        rates.put(Type.HATCHBACK, 100);
        rates.put(Type.SUV, 200);
    }

    private boolean hasEmptySlot(Car car) throws Exception {
        boolean hasSlot = false;
        switch (car.type) {
            case SUV:
                Integer suvCount = this.count.get(car.type);
                if (suvCount > 0) {
                    hasSlot = true;
                    this.count.put(car.type, suvCount-1);
                }
                break;
            case HATCHBACK:
                Integer hatchCount = this.count.get(car.type);
                if (hatchCount > 0) {
                    hasSlot = true;
                    this.count.put(car.type, hatchCount-1);
                } else {
                    Car carDuplicate = new Car(car);
                    carDuplicate.type = Type.SUV;
                    return hasEmptySlot(carDuplicate);
                }
                break;
            default:
                throw new Exception("Invalid Car Type");

        }

        return hasSlot;
    }

    public Ticket parkVehicle(Car car) throws Exception {
        try {
            boolean hasSlot = this.hasEmptySlot(car);
            if (!hasSlot) {
                throw new Exception("No Slots Available");
            }
            Ticket ticket = new Ticket(car, LocalDateTime.now());
            return ticket;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public int unparkVehicle(Ticket t) throws Exception {
        try {

            Integer count = this.count.get(t.car.type);
            this.count.put(t.car.type, count+1);

            Duration duration = Duration.between(t.entryLocalTime, LocalDateTime.now());

            // Get the total seconds and divide by 3600 to get hours
            long seconds = duration.getSeconds();
            double hours = seconds / 3600.0;

            // Use Math.ceil to round up to the nearest hour
            int hoursCeil = (int) Math.ceil(hours);
            return hoursCeil * this.rates.get(t.car.type);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
