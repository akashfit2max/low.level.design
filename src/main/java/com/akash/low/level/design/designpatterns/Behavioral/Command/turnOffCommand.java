package com.akash.low.level.design.designpatterns.Behavioral.Command;

public class turnOffCommand implements Command {

    AirConditioner airConditioner;

    public turnOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOfAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
