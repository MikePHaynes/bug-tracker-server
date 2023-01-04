package com.mph.bugtrackerserver.controller;

import com.mph.bugtrackerserver.model.Ticket;
import com.mph.bugtrackerserver.repository.TicketRepository;
import com.mph.bugtrackerserver.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {
        Ticket savedTicket = ticketService.saveTicket(ticket);
        return new ResponseEntity<>(savedTicket, HttpStatus.CREATED);
    }
}
