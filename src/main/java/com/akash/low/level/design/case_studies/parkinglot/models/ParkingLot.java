package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private List<ParkingFloor> floors = new ArrayList<>();
    private List<EntryGate> entryGates = new ArrayList<>();
    private List<ExitGate> exitGates = new ArrayList<>();
    private DisplayBoard displayBoard;


}
