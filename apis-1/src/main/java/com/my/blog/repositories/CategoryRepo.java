package com.my.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
