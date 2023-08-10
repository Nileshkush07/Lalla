package com.dollop.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.app.entity.Comments;
import com.dollop.app.entity.Posts;
import com.dollop.app.exception.CommentsNotFoundException;
import com.dollop.app.repository.CommentsRepo;
import com.dollop.app.repository.PostsRepo;
import com.dollop.app.service.CommentsService;
@Service
public class CommentsServiceImpl implements CommentsService {
@Autowired
private CommentsRepo cr; 
@Autowired
private PostsRepo pr;
	@Override
	public Comments save(Comments cmnt) {
		
		return this.cr.save(cmnt);
	}
	@Override
	public List<Comments> getAllCommentsByPostID(Long id) {
		Posts p = this.pr.findById(id).get();
		System.out.println("getAllCommentsByPostID".toUpperCase());
		if(p != null)
		{
			return p.getComments();
		}
		throw new CommentsNotFoundException("Comments Not Found "+id);
	}
	@Override
	public Comments getCommentsByPostIdORCommentID(Long postId, Long id) {
		Posts post = new Posts();
		post.setId(postId);
		Optional<Comments> comments = this.cr.findByIdAndPost(id, post);
		if(comments.isPresent())
			return comments.get();		
		throw new CommentsNotFoundException("Comment Not Found "+ id);
	}
	@Override
	public Comments updateCommentByCIDorPostID(Comments cmnt,Long postId,Long id) {
		Posts post = new Posts();
		post.setId(postId);
		cmnt.setId(id);
		Optional<Comments> comments = this.cr.findByIdAndPost(id, post);
		if(comments.isPresent())
		return this.cr.save(cmnt);
		throw new CommentsNotFoundException("Comment Not Found "+ id);
	}
	@Override
	public String deleteCommentByPostIdORCommentID(Long postId, Long id) {
		Posts post = new Posts();
		post.setId(postId);
		Optional<Comments> comments = this.cr.findByIdAndPost(id, post);
		if(comments.isPresent())
		{
			this.cr.deleteById(id);
			return "Comment Deleted";	
		}
		throw new CommentsNotFoundException("Comment Not Found "+ id);
	}
	

}
