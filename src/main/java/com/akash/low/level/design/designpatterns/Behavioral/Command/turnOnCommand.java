package com.akash.low.level.design.designpatterns.Behavioral.Command;

public class turnOnCommand implements Command {

    AirConditioner airConditioner;

    turnOnCommand(AirConditioner ac) {
        this.airConditioner = ac;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOfAc();
    }
}
