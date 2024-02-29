package com.akash.low.level.design.case_studies.parkinglot.service;

import com.akash.low.level.design.case_studies.parkinglot.models.ParkingLot;
import com.akash.low.level.design.case_studies.parkinglot.repository.ParkingLotRepo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParkingLotService {

    private ParkingLotRepo parkingLotRepo;
    private ParkingSpotService parkingSpotService;
    public ParkingLot getParkingLot(Long id) {
        return parkingLotRepo.findById(id);

    }

    public ParkingLot createParkingLot(ParkingLot parkingLot) {
        ParkingLot persistedLot = ParkingLotRepo.save(parkingLot);
        parkingSpotService.createParkingSpot(persistedLot);
        return persistedLot;

    }
}
