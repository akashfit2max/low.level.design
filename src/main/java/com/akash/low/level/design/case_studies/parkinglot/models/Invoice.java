package com.akash.low.level.design.case_studies.parkinglot.models;

import java.util.Date;

public class Invoice extends BaseModel {
    private String invoiceId;
    private Date exitTime;
    private String ticketId;
    private Ticket ticket;
    private double amount;
    private String paymentId;
    private Payment payment;
}
