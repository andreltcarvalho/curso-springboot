package com.fastguiche.loja.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastguiche.loja.entities.Product;
import com.fastguiche.loja.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> userList = service.finAll();
		return ResponseEntity.ok().body(userList);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		 Product object = service.findById(id);
		 
		 return ResponseEntity.ok().body(object);
		
	}
	

}
