package com.akash.low.level.design.case_studies.parkinglot.repository;

import com.akash.low.level.design.case_studies.parkinglot.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {

    List<Ticket> tickets = new ArrayList<>();

    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }
}
