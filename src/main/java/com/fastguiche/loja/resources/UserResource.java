package com.fastguiche.loja.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastguiche.loja.entities.User;
import com.fastguiche.loja.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> userList = service.finAll();
		return ResponseEntity.ok().body(userList);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		 User object = service.findById(id);
		 
		 return ResponseEntity.ok().body(object);
		
	}
	

}
