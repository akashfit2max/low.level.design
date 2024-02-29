package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class ParkingFloor extends BaseModel {
//    private Integer floorNumber;
//    private String name;
    private List<ParkingSpot> parkingSpots = new ArrayList<>();
}
