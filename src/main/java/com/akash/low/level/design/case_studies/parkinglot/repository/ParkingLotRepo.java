package com.akash.low.level.design.case_studies.parkinglot.repository;

import com.akash.low.level.design.case_studies.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {

    private Map<String,ParkingLot> parkingLots = new HashMap<>();
    public ParkingLot save(ParkingLot parkingLot) {
        parkingLots.put(String.valueOf(parkingLot.getId()),parkingLot);
        return parkingLot;
    }

    public ParkingLot findById(Long id) {
        return parkingLots.get(id);
    }
}
