package com.akash.low.level.design.case_studies.CarRentalSystemLLD.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount() {

        return 100.0;
    }
}
