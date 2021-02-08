package com.time.tracker.dao;

import com.time.tracker.domain.Project;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectDao extends JpaRepository<Project, Long>{
    
}
