package com.fastguiche.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastguiche.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
