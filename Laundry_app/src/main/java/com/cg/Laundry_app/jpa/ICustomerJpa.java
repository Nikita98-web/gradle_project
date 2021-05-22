package com.cg.Laundry_app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Laundry_app.models.Customer;

@Repository
public interface ICustomerJpa extends JpaRepository<Customer, String>{
	
}
