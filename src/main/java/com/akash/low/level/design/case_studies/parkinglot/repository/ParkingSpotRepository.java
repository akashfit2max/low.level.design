package com.akash.low.level.design.case_studies.parkinglot.repository;

import com.akash.low.level.design.case_studies.parkinglot.models.ParkingSpot;
import com.akash.low.level.design.case_studies.parkinglot.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {

    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    public void saveAll(List<ParkingSpot> parkingSpots) {
        parkingSpots.addAll(parkingSpots);
    }

    public List<ParkingSpot> findAllByParkingLotId(Long id) {
        return parkingSpots;
    }

    public ParkingSpot findOneById(Long id) {
        return parkingSpots.stream().filter(spot -> spot.getId().equals(id)).findFirst().get();
    }


    public ParkingSpot update(ParkingSpot filledSpot) {

        ParkingSpot currentSpot = parkingSpots
                .stream()
                .filter(spot -> spot.getId().equals(filledSpot.getId()))
                .findFirst()
                .get();

        if (currentSpot == null) {
            throw new RuntimeException("Invalid Parking Spot");
        }

        parkingSpots.remove(currentSpot);
        parkingSpots.add(filledSpot);

        return filledSpot;
    }

    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType vehicleType) {
        return null;
    }
}
