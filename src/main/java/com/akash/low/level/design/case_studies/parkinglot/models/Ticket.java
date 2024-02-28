package com.akash.low.level.design.case_studies.parkinglot.models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel {
    private String ticketId;
    private String vehicleId;
    private VehicleType vehicleType;
    private Integer floorNumber;
    private Integer slotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus status;
}
