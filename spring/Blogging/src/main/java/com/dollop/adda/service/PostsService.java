package com.dollop.app.service;

import java.util.List;

import com.dollop.app.entity.Posts;

public interface PostsService {
	List<Posts> getAllPosts();
	Posts getPostById(Long id);
	Posts save(Posts post);
	Posts updateById(Posts post,Long id);
	String deletePost(Long id);
}
