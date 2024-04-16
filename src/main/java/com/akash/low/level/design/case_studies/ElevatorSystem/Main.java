package com.akash.low.level.design.case_studies.ElevatorSystem;

import com.akash.low.level.design.case_studies.ElevatorSystem.Models.Building;
import com.akash.low.level.design.case_studies.ElevatorSystem.Models.Floor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);
        Floor floor5 = new Floor(5);
        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        Building building = new Building(floorList);

    }
}
