package com.dollop.service;

import java.util.List;

import com.dollop.adda.bean.Post;

public interface Postservice {
	
	public Post getPost(Integer id);
	
	public List<Post> getallPost();
	
	public Post createPost(Post post);
	
	public boolean deletePost(Integer id);
	
	public Post updatePost(Post post,Integer id);

}
