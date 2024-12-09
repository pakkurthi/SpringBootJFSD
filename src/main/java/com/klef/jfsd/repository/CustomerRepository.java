package com.klef.jfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
