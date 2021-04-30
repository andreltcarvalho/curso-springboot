package com.fastguiche.loja.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastguiche.loja.entities.Category;
import com.fastguiche.loja.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResourse {
	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> userList = service.finAll();
		return ResponseEntity.ok().body(userList);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		 Category object = service.findById(id);
		 
		 return ResponseEntity.ok().body(object);
		
	}
	

}
