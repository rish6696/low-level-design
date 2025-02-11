package com.example.adaptee;

public class ChildWeightMachine implements WeightMachine {

    @Override
    public int getWeightInPounds() {
        return 50;
    }
}
