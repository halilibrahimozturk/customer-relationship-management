package com.halilibrahimozturk.springdemo.dao;

import com.halilibrahimozturk.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {


    //need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Customer> getCustomers() {
        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //crate a query ... sort by last name
        Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName",

                Customer.class);

        //execute query and get result list
        List<Customer> customers = theQuery.getResultList();

        //return the results
        return customers;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //save the customer .... finally :)
        currentSession.save(theCustomer);

    }

    @Override
    public Customer getCustomer(int theId) {
        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //get the customer ... with ıd
        Customer theCustomer = currentSession.get(Customer.class, theId);

        return theCustomer;
    }
}
