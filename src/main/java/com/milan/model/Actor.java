package com.milan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	
//	@ManyToMany(mappedBy="actors")
//	private Set<Movie> movies = new HashSet<>();

	public Actor() {}

	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//this.movies = movies;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public Set<Movie> getMovies() {
//		return movies;
//	}
//
//	public void setMovies(Set<Movie> movies) {
//		this.movies = movies;
//	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +  "]";
	}
	
	
	
	
	
	

}
