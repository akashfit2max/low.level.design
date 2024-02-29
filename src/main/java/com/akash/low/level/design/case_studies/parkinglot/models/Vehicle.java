package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Vehicle extends BaseModel {
    private VehicleType type;
}
