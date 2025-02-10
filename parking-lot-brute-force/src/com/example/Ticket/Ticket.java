package com.example.Ticket;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.example.Car.Car;

public class Ticket {
    public Car car;
    public LocalDateTime entryLocalTime;

    public Ticket(Car car, LocalDateTime enLocalTime) {
        this.car = car;
        this.entryLocalTime = enLocalTime;
    }

    public String toString(){
        String entryTime = this.entryLocalTime.atZone(ZoneOffset.UTC).toString();
        return String.format("Car Number is %s and entryTime is %s ", this.car.regNumber, entryTime );
    }

}
