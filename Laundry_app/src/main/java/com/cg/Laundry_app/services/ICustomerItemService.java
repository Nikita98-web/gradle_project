package com.cg.Laundry_app.services;
import java.util.List;

import com.cg.Laundry_app.models.*;

public interface ICustomerItemService {
	CustomerItem addItem(CustomerItem item);
	CustomerItem removeItem(long id)throws Exception;
	CustomerItem updateItem(long id, CustomerItem item)throws Exception;
	CustomerItem getItem(long id)throws Exception;
	List<CustomerItem> getItemsByCustomer(long customerId)throws Exception;
}