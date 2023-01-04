package com.mph.bugtrackerserver.repository;

import com.mph.bugtrackerserver.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
