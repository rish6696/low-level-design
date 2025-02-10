package com.example.Toppings;

import com.example.Basepizaa.Basepizza;

public abstract class Basetoping extends Basepizza {

    Basepizza base;

    public Basetoping(Basepizza base) {
        this.base = base;
    }
}
