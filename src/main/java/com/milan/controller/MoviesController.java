package com.milan.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milan.model.Actor;
import com.milan.model.Movie;
import com.milan.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	private MovieService ms;
		
	@GetMapping("/movie-by-id/{id}")
	public Movie showMovieById(@PathVariable long id) {
		return ms.getMovieById(id);
	}
	
	@GetMapping("/movie-by-title/{title}")
	public Movie showMoviesByTitle(@PathVariable String title) {
		return ms.getMovieByTitle(title);
	}

	@PostMapping("/movie-by-actors")
	public Set<Movie> showMoviesByActors(@RequestBody List<Actor> actors) {
		return ms.getMoviesByActors(actors);
	}
	
	
}
