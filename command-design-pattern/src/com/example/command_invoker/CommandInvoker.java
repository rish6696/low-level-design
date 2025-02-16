package com.example.command_invoker;

import com.example.command.Command;
import java.util.Stack;

public class CommandInvoker {

    private Command command;
    private Stack<Command> commandHistory;

    public CommandInvoker() {
        this.commandHistory = new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
        this.commandHistory.push(this.command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

}