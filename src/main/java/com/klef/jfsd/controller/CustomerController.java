package com.klef.jfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.model.Customer;
import com.klef.jfsd.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	 @Autowired
	    private CustomerService customerService;

	    @GetMapping
	    public List<Customer> getAllCustomers() {
	        return customerService.getAllCustomers();
	    }

	    @PostMapping
	    public String addCustomer(@RequestBody Customer customer) {
	        customerService.saveCustomer(customer);
	        return "Customer added successfully!";
	    }
}
