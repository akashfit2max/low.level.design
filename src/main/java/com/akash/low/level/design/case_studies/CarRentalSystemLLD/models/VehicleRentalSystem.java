package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

}
