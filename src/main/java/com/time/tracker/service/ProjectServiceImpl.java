package com.time.tracker.service;

import java.util.List;

import com.time.tracker.dao.ProjectDao;
import com.time.tracker.domain.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    @Transactional( readOnly = true )
    public List<Project> listProjects(){
        return ( List<Project> ) projectDao.findAll();

    }

    @Override
    @Transactional
    public void save( Project project ) {
        projectDao.save( project );
    }

    @Override
    @Transactional
    public void delete( Project project ) {
        projectDao.delete( project );
    }

    @Override
    @Transactional(readOnly = true)
    public Project findProject( Project project ) {
        return projectDao.findById(project.getProjectId()).orElse(null);
    }
}

