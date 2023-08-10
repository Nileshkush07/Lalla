package com.dollop.adda.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.PostRepo;
import com.dollop.adda.bean.Post;
import com.dollop.service.Postservice;
@Service
public class Postimpl implements Postservice{
	
	@Autowired
	private PostRepo pr;

	@Override
	public Post getPost(Integer id) {
		// TODO Auto-generated method stub
		return this.pr.findById(id).get();
	}

	@Override
	public List<Post> getallPost() {
		// TODO Auto-generated method stub
		return this.pr.findAll();
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return this.pr.save(post);
	}

	@Override
	public boolean deletePost(Integer id) {
		// TODO Auto-generated method stub
		if(pr.existsById(id))
		{
			pr.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Post updatePost(Post post,Integer id) {
        Optional<Post> optionalPost = pr.findById(id);
        if (optionalPost.isPresent()) {
            Post existingPost = optionalPost.get();
            existingPost.setP_title(null);
            existingPost.setComments(post.getComments());
            existingPost.setP_body(null);
            return pr.save(existingPost);
        } else {
            return null;
        }
	}

}
