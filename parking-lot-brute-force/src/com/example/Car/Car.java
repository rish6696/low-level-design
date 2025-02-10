package com.example.Car;

import com.example.Slot.Slot;

public class Car {
    public String regNumber;
    public Type type;

    public Car(String regNumber, Type type) {
        this.regNumber = regNumber;
        this.type = type;
    }

    public Slot getAvailableSlot() {
        return null;
    }

    public Car(Car c){
        this.regNumber = c.regNumber;
        this.type = c.type;
    }
}