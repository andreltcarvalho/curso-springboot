package com.fastguiche.loja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastguiche.loja.entities.Order;
import com.fastguiche.loja.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> finAll(){
		
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		 Optional<Order> object = repository.findById(id);
		return object.get();
	}
}
