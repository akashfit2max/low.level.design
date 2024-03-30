package com.akash.low.level.design.designpatterns.Behavioral.Command;

import java.util.Stack;

public class Remote {

    Stack<Command> commands = new Stack<>();
    Command command;

    public Remote() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        while (!commands.isEmpty()) {
            Command lastCommand = commands.pop();
            lastCommand.undo();
        }
    }
}
