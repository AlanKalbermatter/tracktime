package com.time.tracker.service;

import java.util.List;

import com.time.tracker.domain.TimeEntry;

public interface TimeEntryService {
    
    public List<TimeEntry> listTimeEntry();

    public void save(TimeEntry timeEntry);

    public void delete(TimeEntry timeEntry);

    public TimeEntry findTimeEntry(TimeEntry timeEntry);
}
