package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.Data;

import java.util.Date;

@Data
public class Vehicle {
    int vehicleID;
    int vehicleNumber;
    VehicleType vehicleType;
    String companyName;
    String modelName;
    int kmDriven;
    Date manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;
    Status status;

}
