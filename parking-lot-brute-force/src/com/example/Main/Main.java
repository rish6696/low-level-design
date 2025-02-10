package com.example.Main;

import com.example.Car.Car;
import com.example.Car.Type;
import com.example.Parkingmanager.Parkingmanager;
import com.example.Ticket.Ticket;

public class Main {
    public static void main(String[] args) {
        Parkingmanager pm = new Parkingmanager(1,0);
        Car baleeno = new Car("DL5CU8897",Type.HATCHBACK);
        Car sonet = new Car("HR51AB9023",Type.HATCHBACK);


        try {
            Ticket t = pm.parkVehicle(baleeno);
            System.out.println(t.toString());


            Thread.sleep(2000);


            // int ballenoFare = pm.unparkVehicle(t);

            // System.out.println(String.format("Charge balleeno is %d",ballenoFare));


            Ticket a = pm.parkVehicle(sonet);
            System.out.println(a.toString());


        } catch (Exception e) {
            System.out.println("Exception occured"+ e.getMessage());
        }

    }
}
