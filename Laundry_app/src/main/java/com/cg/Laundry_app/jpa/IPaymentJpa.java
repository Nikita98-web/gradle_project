package com.cg.Laundry_app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Laundry_app.models.Payment;


public interface IPaymentJpa extends JpaRepository<Payment,Long> {
	
}
