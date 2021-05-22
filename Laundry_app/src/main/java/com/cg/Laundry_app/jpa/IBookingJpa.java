package com.cg.Laundry_app.jpa;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Laundry_app.models.Booking;
import com.cg.Laundry_app.models.Customer;



public interface IBookingJpa extends JpaRepository<Booking, Long> {
	List<Booking> findByBookingDate(LocalDate date);
	List<Booking> findByCustomerDetails(Customer customer);
}
