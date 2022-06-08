package com.halilibrahimozturk.springdemo.service;

import com.halilibrahimozturk.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();


    void saveCustomer(Customer theCustomer);
}
