package com.akash.low.level.design.case_studies.parkinglot.dto;

import com.akash.low.level.design.case_studies.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatTicketRequest {
    private Long parkingLotId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Long entryGateId;
    private Long issuerId;
}
