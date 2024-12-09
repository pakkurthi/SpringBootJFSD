package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Customer;
import com.klef.jfsd.repository.CustomerRepository;

@Service
public class CustomerService {
	 @Autowired
	    private CustomerRepository customerRepository;

	    public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }

	    public void saveCustomer(Customer customer) {
	        customerRepository.save(customer);
	    }
}
