package com.milan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.milan.model.Actor;
import com.milan.model.Movie;
import com.milan.repository.MovieRepository;

@Service
@Transactional
public class MovieService {
	
	@Autowired
	private MovieRepository mr;
	
	public List<Movie> getMovies() {
		List<Movie> movies = new ArrayList<>();
		for(Movie movie : mr.findAll()) {
			movies.add(movie);
		}
		return movies;
	}
	
	public Movie getMovieByTitle(String title) {
		return mr.findByTitle(title);
	}
	
	public Movie getMovieById(long id) {
		return mr.findById(id).get();
	}
	
	public void saveMovie(Movie movie) {
		mr.save(movie);
	}
	
	public void updateMovie(Movie movie) {
		mr.save(movie);
	}
	
	public void deleteMovie(Movie movie) {
		mr.delete(movie);
	}
	
	public void deleteMovieById(long id) {
		mr.deleteById(id);
	}

	public Set<Movie> getMoviesByActors(List<Actor> actors) {
		return mr.findByActorsIn(actors);
	}

}
