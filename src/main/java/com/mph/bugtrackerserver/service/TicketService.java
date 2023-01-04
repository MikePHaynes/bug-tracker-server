package com.mph.bugtrackerserver.service;

import com.mph.bugtrackerserver.model.Ticket;
import com.mph.bugtrackerserver.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
