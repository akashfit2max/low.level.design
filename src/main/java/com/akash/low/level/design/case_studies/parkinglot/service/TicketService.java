package com.akash.low.level.design.case_studies.parkinglot.service;

import com.akash.low.level.design.case_studies.parkinglot.dto.CreatTicketRequest;
import com.akash.low.level.design.case_studies.parkinglot.models.ParkingSpot;
import com.akash.low.level.design.case_studies.parkinglot.models.SpotStatus;
import com.akash.low.level.design.case_studies.parkinglot.models.Ticket;
import com.akash.low.level.design.case_studies.parkinglot.repository.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {
    private ParkingSpotService parkingSpotService;
    private VehicleService vehicleService;

    private TicketRepository ticketRepository;
    public Ticket creatTicket(CreatTicketRequest request) {

        //check if the parking lot is full
        ParkingSpot parkingSpot = parkingSpotService.allocateSlot(request.getParkingLotId(), request.getVehicleType());
        if (parkingSpot == null) {
            throw new RuntimeException("slots not available");
        }

        parkingSpot.setSpotStatus(SpotStatus.FILLED);
        parkingSpotService.update(parkingSpot);

        Ticket ticket = Ticket.builder().entryTime(LocalDateTime.now()).parkingSpotId(parkingSpot.getId()).entryGateId(request.getEntryGateId()).issuerId(request.getIssuerId())
                .vehicle(vehicleService.findOrCreate(request.getVehicleNumber(), request.getVehicleType())).build();
        return ticketRepository.save(ticket);

    }
}
