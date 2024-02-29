package com.akash.low.level.design.case_studies.parkinglot.service;

import com.akash.low.level.design.case_studies.parkinglot.models.ParkingLot;
import com.akash.low.level.design.case_studies.parkinglot.models.ParkingSpot;
import com.akash.low.level.design.case_studies.parkinglot.models.VehicleType;
import com.akash.low.level.design.case_studies.parkinglot.repository.ParkingSpotRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void createParkingSpot(ParkingLot lot) {
        List<ParkingSpot> parkingSpots = lot.getFloors().stream().flatMap(floor -> floor.getParkingSpots().stream()).collect(Collectors.toList());
        parkingSpotRepository.saveAll(parkingSpots);
    }

    public List<ParkingSpot> getParkingSpots(Long id) {
        return parkingSpotRepository.findAllByParkingLotId(id);
    }

    public ParkingSpot getParkingSpot(Long id) {
        return parkingSpotRepository.findOneById(id);
    }

    public ParkingSpot allocateSlot(Long parkingLotId, VehicleType vehicleType) {
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }

    public ParkingSpot update(ParkingSpot filledSpot) {
        return parkingSpotRepository.update(filledSpot);
    }
}
