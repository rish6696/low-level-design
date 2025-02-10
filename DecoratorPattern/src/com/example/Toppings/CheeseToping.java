package com.example.Toppings;

import com.example.Basepizaa.Basepizza;

public class CheeseToping extends Basetoping {
    public CheeseToping(Basepizza base) {
        super(base);
        // TODO Auto-generated constructor stub
    }

    int price = 90;

    public int calculatePrice() {
        return this.base.calculatePrice() + this.price;
    }
}
