package com.akash.low.level.design.case_studies.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel {
    private Integer floorNumber;
    private String name;
    private List<ParkingSpot> parkingSpots = new ArrayList<>();
}
