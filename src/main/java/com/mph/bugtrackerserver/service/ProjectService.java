package com.mph.bugtrackerserver.service;

import com.mph.bugtrackerserver.model.Project;
import com.mph.bugtrackerserver.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}
