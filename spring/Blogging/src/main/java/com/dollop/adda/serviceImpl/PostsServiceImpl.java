package com.dollop.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.app.entity.Posts;
import com.dollop.app.entity.User;
import com.dollop.app.exception.PostNotFoundException;
import com.dollop.app.exception.UserNotFoundException;
import com.dollop.app.repository.PostsRepo;
import com.dollop.app.repository.UserRepo;
import com.dollop.app.service.PostsService;
@Service
public class PostsServiceImpl implements PostsService {
	@Autowired
	private PostsRepo pr;
	@Autowired
	private UserRepo ur;
	@Override
	public List<Posts> getAllPosts() {
		List<Posts> post =  this.pr.findAll();
		if(post.isEmpty())
		{
			throw new PostNotFoundException("Posts Not Found ");
		}
		return this.pr.findAll();
	}
	@Override
	public Posts getPostById(Long id) {
		Posts p = this.pr.findPostsById(id);
		if(p != null)
		{
			return p;
		}
		throw new PostNotFoundException("Post Not Found ID "+id);
	}
	@Override
	public Posts save(Posts post ) {
		User u = this.ur.findById(post.getUser().getId()).get();
		if(u != null)
		{
			return this.pr.save(post);
		}
		throw new UserNotFoundException("User Not Found "+post.getUser().getId());
	}
	@Override
	public Posts updateById(Posts post, Long id) {
		
		Posts p = this.pr.findById(id).get();
		if(p != null)
		{
			return this.pr.save(post);
		}
		throw new PostNotFoundException("Post Not Found "+id);
	}
	@Override
	public String deletePost(Long id) {
		Optional<Posts> p ;
		try {
			p = this.pr.findById(id);
			if(p.get() != null)
			{
				this.pr.deleteById(id);
				return "Post Deleted";
			}
			throw new PostNotFoundException("Post Not Found "+id);
		} catch (Exception e) {
			e.printStackTrace();
			throw  new PostNotFoundException("Post Not Found "+id);
		}
		
	}

}
