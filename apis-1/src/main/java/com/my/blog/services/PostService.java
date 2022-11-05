package com.my.blog.services;

import java.util.List;

import com.my.blog.payloads.PostDto;
import com.my.blog.payloads.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get single post
	PostDto getPost(Integer postId);
	
	//get all posts
	//List<PostDto> getAllPosts(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	PostResponse getAllPosts(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//get all posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by category
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);

}
