package com.carlossantos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carlossantos.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String>{
	
}
