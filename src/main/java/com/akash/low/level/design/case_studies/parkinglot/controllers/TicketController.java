package com.akash.low.level.design.case_studies.parkinglot.controllers;

import com.akash.low.level.design.case_studies.parkinglot.dto.CreatTicketRequest;
import com.akash.low.level.design.case_studies.parkinglot.models.Ticket;
import com.akash.low.level.design.case_studies.parkinglot.service.TicketService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TicketController {
    private TicketService ticketService;

    public Ticket createTicket(CreatTicketRequest request) {
        return ticketService.creatTicket(request);
    }
}
