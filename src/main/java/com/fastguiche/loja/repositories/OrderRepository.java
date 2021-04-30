package com.fastguiche.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastguiche.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
