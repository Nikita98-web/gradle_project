package com.cg.Laundry_app.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Laundry_app.models.Order;



public interface IOrderJpa extends JpaRepository <Order, Long> {

}
