package com.akash.low.level.design.designpatterns.Behavioral.nullObject;

public class VehicleFactory {

    static Vehicle getVehicle(String typeOfVehicle) {
        if ("Car".equals(typeOfVehicle)) {
            return new Car();
        }
        return new NullObject();
    }
}
