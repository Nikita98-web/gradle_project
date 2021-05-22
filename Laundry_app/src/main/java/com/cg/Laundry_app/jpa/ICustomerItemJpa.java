package com.cg.Laundry_app.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Laundry_app.models.Customer;
import com.cg.Laundry_app.models.CustomerItem;



public interface ICustomerItemJpa extends JpaRepository<CustomerItem , Long>{
	List<CustomerItem> findByCustomer(Customer customer);
}
