package com.milan;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.milan.model.Actor;
import com.milan.model.Genre;
import com.milan.model.Movie;
import com.milan.service.ActorService;
import com.milan.service.GenreService;
import com.milan.service.MovieService;

@SpringBootApplication
public class SpringbootAngularMovieRentAppApplication implements CommandLineRunner {
	
	@Autowired 
	private ActorService as;
	
	@Autowired 
	private GenreService gs;
	
	@Autowired 
	private MovieService ms;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAngularMovieRentAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Adding Actors
		Actor a1 = new Actor();
		Actor a2 = new Actor();
		Actor a3 = new Actor();
		Actor a4 = new Actor();
		Actor a5 = new Actor();
		Actor a6 = new Actor();
		Actor a7 = new Actor();
		Actor a8 = new Actor();
		Actor a9 = new Actor();
		Actor a10 = new Actor();
		
		
		a1.setFirstName("Robert");
		a1.setLastName("De Niro");
		as.saveActor(a1);
		
		a2.setFirstName("Al");
		a2.setLastName("Pacino");
		as.saveActor(a2);
		
		a3.setFirstName("Tom");
		a3.setLastName("Hanks");
		as.saveActor(a3);
		
		a4.setFirstName("Brad");
		a4.setLastName("Pit");
		as.saveActor(a4);
		
		a5.setFirstName("Tom");
		a5.setLastName("Cruise");
		as.saveActor(a5);
		
		a6.setFirstName("Angelina");
		a6.setLastName("Jollie");
		as.saveActor(a6);
		
		a7.setFirstName("Julia");
		a7.setLastName("Roberts");
		as.saveActor(a7);
		
		a8.setFirstName("Sandra");
		a8.setLastName("Bullock");
		as.saveActor(a8);
		
		a9.setFirstName("Nicole");
		a9.setLastName("Kidman");
		as.saveActor(a9);
		
		a10.setFirstName("Meg");
		a10.setLastName("Ryan");
		as.saveActor(a10);
		
		
		//Adding Genre
		Genre g1 = new Genre();
		Genre g2 = new Genre();
		Genre g3 = new Genre();
		Genre g4 = new Genre();
		Genre g5 = new Genre();
		
		g1.setTitle("Romance");
		gs.saveGenre(g1);
		
		g2.setTitle("Drama");
		gs.saveGenre(g2);
		
		g3.setTitle("Comedy");
		gs.saveGenre(g3);
		
		g4.setTitle("Action");
		gs.saveGenre(g4);
		
		g5.setTitle("Triller");
		gs.saveGenre(g5);
		
		
		
		//Adding Movies
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		Movie m4 = new Movie();
		Movie m5 = new Movie();
		Movie m6 = new Movie();
		
		m1.setTitle("You've got mail");
		m1.setGenre(gs.getGenreByTitle("Romance"));
		Set<Actor> actors1 = new HashSet<Actor>();
		actors1.add(as.getActorByName("Tom", "Hanks"));
		actors1.add(as.getActorByName("Meg", "Ryan"));
		m1.setActors(actors1);
		ms.saveMovie(m1);
		
		m2.setTitle("The Godfather");
		m2.setGenre(gs.getGenreByTitle("Drama"));
		Set<Actor> actors2 = new HashSet<Actor>();
		actors2.add(as.getActorByName("Robert", "De Niro"));
		actors2.add(as.getActorByName("Al", "Pacino"));
		m2.setActors(actors2);
		ms.saveMovie(m2);
		
		m3.setTitle("Pretty Woman");
		m3.setGenre(gs.getGenreByTitle("Romance"));
		Set<Actor> actors3 = new HashSet<Actor>();
		actors3.add(as.getActorByName("Julia", "Roberts"));
		m3.setActors(actors3);
		ms.saveMovie(m3);
		
		m4.setTitle("Mr. & Mrs. Smith");
		m4.setGenre(gs.getGenreByTitle("Triller"));
		Set<Actor> actors4 = new HashSet<Actor>();
		actors4.add(as.getActorByName("Angelina", "Jollie"));
		actors4.add(as.getActorByName("Brad", "Pit"));
		m4.setActors(actors4);
		ms.saveMovie(m4);
		
		m5.setTitle("Miss Congeniality");
		m5.setGenre(gs.getGenreByTitle("Comedy"));
		Set<Actor> actors5 = new HashSet<Actor>();
		actors5.add(as.getActorByName("Sandra", "Bullock"));
		m5.setActors(actors5);
		ms.saveMovie(m5);
		
		m6.setTitle("Top Gun");
		m6.setGenre(gs.getGenreByTitle("Drama"));
		Set<Actor> actors6 = new HashSet<Actor>();
		actors6.add(as.getActorByName("Tom", "Cruise"));
		m6.setActors(actors6);
		ms.saveMovie(m6);
		
	}
}
