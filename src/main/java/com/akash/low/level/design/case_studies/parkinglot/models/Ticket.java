package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class Ticket extends BaseModel {
    private Long vehicleId;
    private Vehicle vehicle;

    private Long parkingSpotId;
    private ParkingSpot parkingSpot;

    private LocalDateTime entryTime;

    private Long issuerId;
    private Operator issuedBy;

    private Long entryGateId;
    private Gate entryGate;
}
