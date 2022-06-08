package com.halilibrahimozturk.springdemo.service;

import com.halilibrahimozturk.springdemo.dao.CustomerDAO;
import com.halilibrahimozturk.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    //need to inject customer DAO

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    @Override
    public List<Customer> getCustomers() {

        return customerDAO.getCustomers();

    }

    @Transactional
    @Override
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Transactional
    @Override
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }
}
