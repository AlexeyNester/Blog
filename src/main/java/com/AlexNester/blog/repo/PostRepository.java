package com.AlexNester.blog.repo;

import org.springframework.data.repository.CrudRepository;

import com.AlexNester.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	
}
