package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Gate {
    ParkingGateType parkingGateType;
    Operator operator;
}
