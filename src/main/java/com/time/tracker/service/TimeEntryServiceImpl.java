package com.time.tracker.service;

import java.util.List;

import com.time.tracker.dao.TimeEntryDao;
import com.time.tracker.domain.TimeEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TimeEntryServiceImpl implements TimeEntryService{
    
    @Autowired
    private TimeEntryDao timeEntryDao;

    @Override
    public List<TimeEntry> listTimeEntry() {
        return (List<TimeEntry>) timeEntryDao.findAll();
    }

    @Override
    @Transactional
    public void save(TimeEntry timeEntry) {
        timeEntryDao.save(timeEntry);
    }

    @Override
    @Transactional
    public void delete(TimeEntry timeEntry) {
        timeEntryDao.delete(timeEntry);
    }

    @Override
    @Transactional
    public TimeEntry findTimeEntry(TimeEntry timeEntry) {
        return timeEntryDao.findById(timeEntry.getTimeEntryId()).orElse(null);
    }
}
