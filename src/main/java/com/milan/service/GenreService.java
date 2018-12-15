package com.milan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.milan.model.Genre;
import com.milan.repository.GenreRepository;

@Service
@Transactional
public class GenreService {
	
	@Autowired
	private GenreRepository gs;
	
	
	public List<Genre> getGenres(){
		List<Genre> genres = new ArrayList<>();
		for(Genre genre : gs.findAll()) {
			genres.add(genre);
		}
		return genres;
	}
	
	public Genre getGenreByTitle(String title) {
		return gs.findByTitle(title);
	}
	
	public Genre getGenreById(long id) {
		return gs.findById(id).get();
	}
	
	public void saveGenre(Genre genre) {
		gs.save(genre);
	}

}
