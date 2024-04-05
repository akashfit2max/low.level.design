package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventoryManagement.getVehicles();
    }

    public Reservation creatReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId) {
        return true;
    }
}
