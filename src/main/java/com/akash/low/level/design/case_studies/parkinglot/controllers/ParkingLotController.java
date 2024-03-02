package com.akash.low.level.design.case_studies.parkinglot.controllers;

import com.akash.low.level.design.case_studies.parkinglot.dto.ParkingLotRequest;
import com.akash.low.level.design.case_studies.parkinglot.models.ParkingLot;
import com.akash.low.level.design.case_studies.parkinglot.service.ParkingLotService;
import com.akash.low.level.design.case_studies.parkinglot.service.ParkingSpotService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ParkingLotController {

    private ParkingLotService parkingLotService;
    private ParkingSpotService parkingSpotService;
    public ParkingLot createParkingLot(ParkingLotRequest request) {
        return parkingLotService.createParkingLot(request.toParkingLot());
    }

    public ParkingLot getParkingLot(Long id) {
        return parkingLotService.getParkingLot(id);
    }
}
