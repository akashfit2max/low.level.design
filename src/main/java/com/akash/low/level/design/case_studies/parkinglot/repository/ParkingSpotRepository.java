package com.akash.low.level.design.case_studies.parkinglot.repository;

import com.akash.low.level.design.case_studies.parkinglot.models.ParkingSpot;
import com.akash.low.level.design.case_studies.parkinglot.models.VehicleType;

import java.util.List;

public class ParkingSpotRepository {
    public void saveAll(List<ParkingSpot> parkingSpots) {
    }

    public List<ParkingSpot> findAllByParkingLotId(Long id) {
        return null;
    }

    public ParkingSpot findOneById(Long id) {
        return null;
    }


    public ParkingSpot update(ParkingSpot filledSpot) {
        return null;
    }

    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType vehicleType) {
        return null;
    }
}
