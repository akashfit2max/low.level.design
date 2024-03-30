package com.akash.low.level.design.designpatterns.Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Remote remote = new Remote();
        remote.setCommand(new turnOnCommand(airConditioner));
        remote.pressButton();
        remote.undo();
    }
}
