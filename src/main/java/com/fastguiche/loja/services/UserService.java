package com.fastguiche.loja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastguiche.loja.entities.User;
import com.fastguiche.loja.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> finAll(){
		
		return repository.findAll();
	}
	
	public User findById(Long id) {
		 Optional<User> object = repository.findById(id);
		return object.get();
	}
}
