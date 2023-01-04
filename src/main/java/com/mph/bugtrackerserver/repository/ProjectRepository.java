package com.mph.bugtrackerserver.repository;

import com.mph.bugtrackerserver.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
