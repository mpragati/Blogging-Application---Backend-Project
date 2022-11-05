package com.my.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.blog.entities.Category;
import com.my.blog.entities.Post;
import com.my.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String Title);
 
}
