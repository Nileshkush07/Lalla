package com.dollop.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.app.entity.Comments;
import com.dollop.app.entity.Posts;

public interface CommentsRepo extends JpaRepository<Comments, Long> {
	public Optional<Comments> findByIdAndPost(Long id,Posts p);
}
