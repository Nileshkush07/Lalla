package com.dollop.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.app.entity.Posts;
import com.dollop.app.entity.User;

public interface PostsRepo extends JpaRepository<Posts, Long> {
	Posts findPostsById(Long id);
	User findUserById(Long id);
}
