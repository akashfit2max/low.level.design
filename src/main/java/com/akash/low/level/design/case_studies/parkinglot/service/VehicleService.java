package com.akash.low.level.design.case_studies.parkinglot.service;

import com.akash.low.level.design.case_studies.parkinglot.models.Vehicle;
import com.akash.low.level.design.case_studies.parkinglot.models.VehicleType;

public class VehicleService {
    public Vehicle findOrCreate(String vehicleNumber, VehicleType vehicleType) {
        return Vehicle.builder().LicenseNumber(vehicleNumber).type(vehicleType).build();
    }
}
