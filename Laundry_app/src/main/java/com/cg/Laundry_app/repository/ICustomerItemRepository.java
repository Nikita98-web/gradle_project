package com.cg.Laundry_app.repository;

import java.util.List;

import com.cg.Laundry_app.exception.NotFoundException;
import com.cg.Laundry_app.models.CustomerItem;

public interface ICustomerItemRepository {
	CustomerItem addItem(CustomerItem item);
	CustomerItem removeItem(long id)throws Exception;
	CustomerItem updateItem(long id, CustomerItem item)throws Exception;
	CustomerItem getItem(long id)throws Exception;
	List<CustomerItem> getItemsByCustomer(long customerId)throws Exception;
}
