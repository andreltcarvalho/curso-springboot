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

	public List<User> finAll() {

		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> object = repository.findById(id);
		return object.get();
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}
}
