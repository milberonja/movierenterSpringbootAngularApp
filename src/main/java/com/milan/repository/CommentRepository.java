package com.milan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.milan.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
