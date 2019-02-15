package com.aman.repository;

import org.springframework.data.repository.CrudRepository;

import com.aman.module.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public User findByUsernameAndPassword(String username, String password);

}
