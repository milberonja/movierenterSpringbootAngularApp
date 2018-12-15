package com.milan.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Movie implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	
	@CreatedDate
	@Column(columnDefinition="TIMESTAMP")
	private Date published = new Date();
	
	@OneToOne
	@JoinColumn(name="genre_id")
	private Genre genre;
	
	@OneToMany(mappedBy="movie", 
			   orphanRemoval=true, 
			   cascade=CascadeType.REMOVE)
	private List<Comment> comments;
	
	@ManyToMany
	@JoinTable(name = "movie_actor",
     		   joinColumns = @JoinColumn(name = "movie_id"),
               inverseJoinColumns = @JoinColumn(name = "actor_id"))
	private Set<Actor> actors = new HashSet<>();
	
	
	public Movie() {}

	public Movie(String title, Date published, Genre genre, List<Comment> comments, Set<Actor> actors) {
		this.title = title;
		this.published = published;
		this.genre = genre;
		this.comments = comments;
		this.actors = actors;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", published=" + published + ", genre=" + genre + ", comments="
				+ comments + ", actors=" + actors + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
