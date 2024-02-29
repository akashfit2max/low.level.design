package com.akash.low.level.design.case_studies.parkinglot.dto;

import com.akash.low.level.design.case_studies.parkinglot.models.*;

import java.util.Collections;
import java.util.List;

public class ParkingLotRequest {
    private long id;
    private String name;
    private String address;
    private int numberOfFloors;
    private int numberOfSlotsPerFloor;
    private int numberOfGates;

    public ParkingLot toParkingLot() {
        List<ParkingSpot> parkingSpotsPerFloor = Collections.nCopies(numberOfSlotsPerFloor, ParkingSpot.mediumAvailable());
        parkingSpotsPerFloor.forEach(spot -> spot.setId(1L));

        // Create floors
        List<ParkingFloor> parkingFloors = Collections.nCopies(numberOfFloors,
                ParkingFloor
                        .builder()
                        .parkingSpots(parkingSpotsPerFloor)
                        .build());

        return ParkingLot
                .builder()
                .id(id)
                .name(name)
                .address(address)
                .floors(parkingFloors)
                .entryGates(Collections.nCopies(numberOfGates, EntryGate.builder().build()))
                .exitGates(Collections.nCopies(numberOfGates, ExitGate.builder().build()))
                .build();
    }
}
