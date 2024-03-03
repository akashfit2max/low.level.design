package com.akash.low.level.design.case_studies.parkinglot.dto;

import com.akash.low.level.design.case_studies.parkinglot.generators.ParkingFloorId;
import com.akash.low.level.design.case_studies.parkinglot.generators.ParkingSpotId;
import com.akash.low.level.design.case_studies.parkinglot.models.*;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class ParkingLotRequest {
    private long id;
    private String name;
    private String address;
    private int numberOfFloors;
    private int numberOfSlotsPerFloor;
    private int numberOfGates;

    public ParkingLot toParkingLot() {
        List<ParkingSpot> parkingSpots = Collections.nCopies(numberOfSlotsPerFloor, ParkingSpot.mediumAvailable());
        parkingSpots.forEach(parkingSpot -> parkingSpot.setId(ParkingSpotId.nextId()));

        // Create dummy parking floors and update their ids
        List<ParkingFloor> parkingFloors = Collections.nCopies(numberOfFloors,
                ParkingFloor
                        .builder()
                        .parkingSpots(parkingSpots)
                        .build());
        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(ParkingFloorId.nextId()));

        return ParkingLot
                .builder()
                .id(id)
                .name(name)
                .address(address)
                .floors(parkingFloors)
                .displayBoard(DisplayBoard.builder().build())
                .entryGates(Collections.nCopies(numberOfFloors, EntryGate.builder().build()))
                .exitGates(Collections.nCopies(numberOfFloors, ExitGate.builder().build()))
                .build();
    }
}
