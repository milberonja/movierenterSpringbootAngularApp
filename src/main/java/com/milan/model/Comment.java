package com.milan.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String userName;
	private String commentBody;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="movie_id")
	private Movie movie;

	
	public Comment() {}

	public Comment(String userName, String commentBody, Movie movie) {
		this.userName = userName;
		this.commentBody = commentBody;
		this.movie = movie;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", userName=" + userName + ", commentBody=" + commentBody + ", movie=" + movie
				+ "]";
	}
	
	
	
	
	
	
	

}
