package com.milan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.milan.model.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
	
	Genre findByTitle(String title);

}
