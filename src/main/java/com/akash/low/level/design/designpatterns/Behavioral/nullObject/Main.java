package com.akash.low.level.design.designpatterns.Behavioral.nullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        showDetails(vehicle);
    }

    private static void showDetails(Vehicle vehicle) {
        System.out.println("seating capacity " + vehicle.seatCapacity());
        System.out.println("tank capa " + vehicle.tankCapacity());
    }
}
