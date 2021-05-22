package com.cg.Laundry_app.services;
import java.util.List;

import com.cg.Laundry_app.exception.NotFoundException;
import com.cg.Laundry_app.models.*;

public interface ICustomerService {
	Customer addCustomer(Customer customer);
	Customer removeCustomer(long custId)throws NotFoundException;
	Customer updateCustomer(long custId, Customer customer)throws NotFoundException;
	Customer getCustomer(long custId)throws Exception;
	List<Customer> getAllCustomers();
}
