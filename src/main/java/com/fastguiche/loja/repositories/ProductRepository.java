package com.fastguiche.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastguiche.loja.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
