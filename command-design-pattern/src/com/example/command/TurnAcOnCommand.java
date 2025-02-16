package com.example.command;

import com.example.air_conditioner.AirConditioner;

public class TurnAcOnCommand implements Command {

    AirConditioner airConditioner;

    public TurnAcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.setOn(true);
    }

    @Override
    public void undo() {
        this.airConditioner.setOn(false);
    }

}
