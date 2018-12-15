package com.milan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.milan.model.Actor;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer> {
	
	Actor findByFirstNameAndLastName(String firstName, String lastName);
	
	

}
