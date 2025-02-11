package com.example.adapter;

import com.example.adaptee.WeightMachine;

public class ChildWeightAdapter implements WeightAdapter {

    private WeightMachine weightMachine;

    public ChildWeightAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKilograms() {
        return weightMachine.getWeightInPounds() / 2;
    }

}
