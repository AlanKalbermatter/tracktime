package com.time.tracker.domain;


import javax.persistence.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "time_entry")
public class TimeEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeEntryId;

    private Timestamp fromTime;

    private Timestamp toTime;
    
    @ManyToOne 
    @JoinColumn (name = "project_id") 
    private Project project;
    
    @ManyToOne 
    @JoinColumn (name = "usuario_id") 
    private User user;
    
}
