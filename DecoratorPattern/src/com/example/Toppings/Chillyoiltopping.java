package com.example.Toppings;

import com.example.Basepizaa.Basepizza;

public class Chillyoiltopping extends Basetoping {

    int price = 120;

    public Chillyoiltopping(Basepizza base) {
        super(base);
    }

    public int calculatePrice() {
        return this.base.calculatePrice() + this.price;
    }

}
