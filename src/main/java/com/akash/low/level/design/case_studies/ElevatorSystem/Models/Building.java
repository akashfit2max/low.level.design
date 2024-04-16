package com.akash.low.level.design.case_studies.ElevatorSystem.Models;

import java.util.List;

public class Building {
    List<Floor> floorList;

    public Building(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public void addFloors(Floor newFloor) {
        floorList.add(newFloor);
    }

    public void removeFloors(Floor removeFloor) {
        floorList.remove(removeFloor);
    }

    List<Floor> getAllFloorList() {
        return floorList;
    }
}
