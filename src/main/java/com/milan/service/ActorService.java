package com.milan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.milan.model.Actor;
import com.milan.repository.ActorRepository;

@Service
@Transactional
public class ActorService {
	
	@Autowired
	private ActorRepository ar;
	
	
	public List<Actor> getActors() {
		List<Actor> actors = new ArrayList<>();
		for(Actor actor : ar.findAll()) {
			actors.add(actor);
		}
		return actors;
	}
	
	public Actor getActorById(long id) {
		return ar.findById((int) id).get();
	}
	
	public Actor getActorByName(String firstName, String lastName) {
		return ar.findByFirstNameAndLastName(firstName, lastName);
	}
	
	public void saveActor(Actor actor) {
		ar.save(actor);
	}
	
	public void saveActors(List<Actor> actors) {
		ar.saveAll(actors);
	}
	
	public void updateActor(Actor actor) {
		ar.save(actor);
	}
	
	public void deleteActor(Actor actor) {
		ar.delete(actor);
	}
	
	public void deleteActorById(long id) {
		ar.deleteById((int) id); 
	}

}
