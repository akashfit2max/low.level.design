package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    String address;
    int pincode;
    String city;
    String state;
    String country;

}
