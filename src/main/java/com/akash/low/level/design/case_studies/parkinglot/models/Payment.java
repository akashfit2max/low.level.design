package com.akash.low.level.design.case_studies.parkinglot.models;

import lombok.Data;

@Data
public class Payment {
    private String ticketId;
    private Integer amount;
    private PaymentType mode;
    private PaymentStatus status;
}
