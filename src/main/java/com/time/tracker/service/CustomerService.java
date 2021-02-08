package com.time.tracker.service;

import java.util.List;

import com.time.tracker.domain.Customer;

public interface CustomerService {
    
    public List<Customer> listCustomers();

    public void save(Customer customer);

    public void delete(Customer customer);

    public Customer findCustomer(Customer customer);

}
