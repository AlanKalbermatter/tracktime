package com.time.tracker.dao;

import com.time.tracker.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
    
}
