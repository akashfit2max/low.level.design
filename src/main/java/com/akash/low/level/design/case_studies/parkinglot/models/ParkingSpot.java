package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ParkingSpot extends BaseModel {
    private VehicleType vehicleType;
    private SpotStatus spotStatus;

    public static ParkingSpot mediumAvailable() {
        return ParkingSpot.builder().vehicleType(VehicleType.MEDIUM).spotStatus(SpotStatus.AVAILABLE).build();
    }
}
