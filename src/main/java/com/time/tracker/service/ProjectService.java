package com.time.tracker.service;

import java.util.List;

import com.time.tracker.domain.Project;

public interface ProjectService {
    
    public List<Project> listProjects();

    public void save(Project project);

    public void delete(Project project);

    public Project findProject(Project project);
}
