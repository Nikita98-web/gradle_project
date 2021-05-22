package com.cg.Laundry_app.services;
import java.util.List;

import com.cg.Laundry_app.models.*;

public interface IPaymentService {
	Payment addPayment(Payment payment);
	Payment removePayment(long id)throws Exception;
	Payment updatePayment(long id, Payment payment)throws Exception;
	Payment getPaymentDetails(long id)throws Exception;
	List<Payment> getAllPaymentDetails();
}
