package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleInventoryManagement {
    List<Vehicle> vehicles;
}
