package com.mph.bugtrackerserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "project_id", nullable = false)
    private long projectId;

    @Column(name = "ticket_name", nullable = false)
    private String name;

    @Column(name = "ticket_description", nullable = false)
    private String description;

    @Column(name = "severity_level", nullable = false)
    private SeverityLevel severityLevel;

    @Column(name = "resolved", nullable = false)
    private boolean resolved;
}
