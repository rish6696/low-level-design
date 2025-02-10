package com.example.Client;

import com.example.Basepizaa.Basepizza;
import com.example.Chickendelight.Chickendelight;
import com.example.Toppings.CheeseToping;
import com.example.Toppings.Chillyoiltopping;
import com.example.Vegdelight.Vegdelight;

public class Client {
    public static void main(String[] args) {
        Basepizza chickenPizzaWithChillyOilAndCheese = new CheeseToping(new Chillyoiltopping(new Chickendelight()));
        Basepizza onlyVegDelightPlusCheese = new Chillyoiltopping(new Vegdelight());
        System.out.println(chickenPizzaWithChillyOilAndCheese.calculatePrice());
        System.out.println(onlyVegDelightPlusCheese.calculatePrice());
    }
}
