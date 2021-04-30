package com.fastguiche.loja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastguiche.loja.entities.Product;
import com.fastguiche.loja.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> finAll(){
		
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		 Optional<Product> object = repository.findById(id);
		return object.get();
	}
}
