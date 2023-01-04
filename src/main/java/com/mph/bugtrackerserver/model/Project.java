package com.mph.bugtrackerserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "project")
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "project_name", nullable = false)
    private String name;

    @Column(name = "project_description", nullable = false)
    private String description;
}
