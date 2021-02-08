package com.time.tracker.service;

import java.util.List;

import com.time.tracker.dao.CustomerDao;
import com.time.tracker.domain.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional( readOnly = true )
    public List<Customer> listCustomers() {
        return ( List<Customer> ) customerDao.findAll();
    }

    @Override
    @Transactional
    public void save( Customer customer ) {
        customerDao.save(customer);
    }

    @Override
    @Transactional
    public void delete( Customer customer ) {
        customerDao.delete(customer);
    }

    @Override
    @Transactional( readOnly = true )
    public Customer findCustomer(Customer customer) {
        return customerDao.findById(customer.getCustomerId()).orElse(null);    }
}
