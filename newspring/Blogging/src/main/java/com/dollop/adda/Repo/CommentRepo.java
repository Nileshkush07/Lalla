package com.dollop.adda.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Comments;
import com.dollop.adda.bean.Post;

public interface CommentRepo extends JpaRepository<Comments, Integer> {
	
	public Optional<Comments> findByIdAndPost(Long id,Post p);
	

	

}
