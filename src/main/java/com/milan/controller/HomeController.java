package com.milan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milan.model.Movie;
import com.milan.service.MovieService;

@RestController
public class HomeController {
	
	@Autowired
	private MovieService ms;
	
	@RequestMapping({"", "/"})
	public List<Movie> showAllMovies (){
		List<Movie> movies = ms.getMovies();
		return movies;
	}

}
