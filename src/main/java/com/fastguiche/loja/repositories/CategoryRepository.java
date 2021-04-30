package com.fastguiche.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastguiche.loja.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
