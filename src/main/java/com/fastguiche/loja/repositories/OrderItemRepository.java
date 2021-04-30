package com.fastguiche.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastguiche.loja.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
