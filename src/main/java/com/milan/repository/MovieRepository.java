package com.milan.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.milan.model.Actor;
import com.milan.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
	
	Movie findByTitle(String title);
	
	Set<Movie> findByActorsIn(List<Actor> actors);

}
