package com.time.tracker.domain;

import javax.persistence.Entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "usuario_id")
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "user_name")
    private String userName;
}
