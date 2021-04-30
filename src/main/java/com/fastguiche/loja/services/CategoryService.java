package com.fastguiche.loja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastguiche.loja.entities.Category;
import com.fastguiche.loja.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> finAll(){
		
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category> object = repository.findById(id);
		return object.get();
	}
}
