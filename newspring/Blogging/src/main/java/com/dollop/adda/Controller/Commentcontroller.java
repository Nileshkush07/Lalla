package com.dollop.adda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.Comments;
import com.dollop.service.Commentsservice;


@RestController
@RequestMapping("/cmt")
public class Commentcontroller {
	
	@Autowired
	private Commentsservice cs;
	
	@PostMapping("/{PostId}/comments")
	private ResponseEntity<Comments> save(@PathVariable("PostId")Long postId,@RequestBody Comments cmnt)
	{
		ResponseEntity<Comments> response = new ResponseEntity<Comments>(this.cs.save(cmnt),HttpStatus.OK);
		return response;
	}
//------------------Get all comments which belongs to post with id = postId-----------------------------
	@GetMapping("/{id}/comments")
	private ResponseEntity<List<Comments>> getAllCommentsByPostId(@PathVariable("id")Long id )
	{
		System.out.println("HELLO");
		ResponseEntity<List<Comments>> response;
		try {
			response = new ResponseEntity<List<Comments>>(this.cs.getAllCommentsByPostID(id),HttpStatus.OK);
		} catch (Exception e) {
			throw new CommentsNotFoundException();
		}
		return response;
	}

//---------------Get comment by id if it belongs to post with id = postId----------------------------------
	@GetMapping("/{postId}/comments/{id}")
	private ResponseEntity<Comments> getCommentByPostIdOrID(@PathVariable("postId")Long postId,@PathVariable("id")Long id)
	{
		ResponseEntity<Comments> response ;
		try {
			response = new ResponseEntity<Comments>(this.cs.getCommentsByPostIdORCommentID(postId, id),HttpStatus.OK);
		} catch (CommentsNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	@PutMapping("/{postId}/comments/{id}")
	private ResponseEntity<Comments> updateCommentByCIDorPostID(@PathVariable("postId")Long postId,@PathVariable("id")Long id,@RequestBody Comments cmnt)
	{
		ResponseEntity<Comments>response;
		try {
			response = new ResponseEntity<Comments>(this.cs.updateCommentByCIDorPostID(cmnt, postId, id),HttpStatus.OK);
		} catch (CommentsNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
		
	}
	
	@DeleteMapping("/{postId}/comments/{id}")
	private ResponseEntity<String> deleteCommentByPostIdORCommentID(@PathVariable("postId")Long postId,@PathVariable("id")Long id)
	{
		ResponseEntity<String>response;
		try {
			response = new ResponseEntity<String>(this.cs.deleteCommentByPostIdORCommentID( postId, id),HttpStatus.OK);
		} catch (CommentsNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

}
