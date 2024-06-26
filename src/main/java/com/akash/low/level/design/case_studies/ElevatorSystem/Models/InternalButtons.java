package com.akash.low.level.design.case_studies.ElevatorSystem.Models;

public class InternalButtons {

    InternalDispatcher dispatcher = new InternalDispatcher();

    int[] availableButtons = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int buttonSelected;

    public void pressButton(int destination, ElevatorCar elevatorCar) {
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }
}
