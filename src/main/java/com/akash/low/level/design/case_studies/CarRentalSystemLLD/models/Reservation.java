package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.ToString;

import java.util.Date;

@ToString
public class Reservation {
    public int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle) {
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
        return reservationId;
    }
}
