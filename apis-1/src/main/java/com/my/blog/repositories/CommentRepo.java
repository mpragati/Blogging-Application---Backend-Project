package com.my.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
