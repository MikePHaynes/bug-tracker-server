package com.mph.bugtrackerserver.service;

import com.mph.bugtrackerserver.model.Project;
import com.mph.bugtrackerserver.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public Project getProject(long projectId) {
        return projectRepository.findById(projectId).orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public Project updateProject(long projectId, Project project) {
        Project existingProject = projectRepository.findById(projectId).orElseThrow(() -> new RuntimeException("not found"));
        existingProject.setName(project.getName());
        existingProject.setDescription(project.getDescription());
        projectRepository.save(existingProject);
        return existingProject;
    }
}
