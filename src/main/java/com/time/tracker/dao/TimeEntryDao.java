package com.time.tracker.dao;

import com.time.tracker.domain.TimeEntry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeEntryDao extends JpaRepository<TimeEntry, Long>{
    
}
