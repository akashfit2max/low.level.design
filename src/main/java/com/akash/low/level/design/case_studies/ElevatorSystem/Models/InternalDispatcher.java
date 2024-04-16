package com.akash.low.level.design.case_studies.ElevatorSystem.Models;

import java.util.List;

public class InternalDispatcher {

    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar) {

    }
}
