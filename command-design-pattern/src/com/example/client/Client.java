package com.example.client;

import com.example.air_conditioner.AirConditioner;
import com.example.command.Command;
import com.example.command.TurnAcOnCommand;
import com.example.command_invoker.CommandInvoker;

public class Client {

    public static void main(String[] args) {

        AirConditioner airConditioner = new AirConditioner();
        Command turnOnAcCommand = new TurnAcOnCommand(airConditioner);


        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(turnOnAcCommand);

        invoker.executeCommand();

        invoker.undo();

    }

}
