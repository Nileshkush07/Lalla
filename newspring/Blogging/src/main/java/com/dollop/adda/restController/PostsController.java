package com.dollop.app.restController;

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

import com.dollop.app.entity.Posts;
import com.dollop.app.exception.PostNotFoundException;
import com.dollop.app.exception.UserNotFoundException;
import com.dollop.app.service.PostsService;

@RestController
@RequestMapping("/api/posts")
public class PostsController {
	@Autowired
	private PostsService ps;
	
	@GetMapping("")
	private ResponseEntity<List<Posts>> getAllPosts()
	{
		ResponseEntity<List<Posts>> response;
		try {
			response = new ResponseEntity<List<Posts>>(this.ps.getAllPosts(),HttpStatus.OK);
		} catch (PostNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	@GetMapping("/{id}")
	private ResponseEntity<Posts> getPostById(@PathVariable("id") Long id)
	{
		ResponseEntity<Posts> response ;
		try {
			response = new ResponseEntity<Posts>(this.ps.getPostById(id),HttpStatus.OK);
		} catch (PostNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
//	-----------------------------------Create new post (By logged in user)--------------------------------
	@PostMapping("/")
	private ResponseEntity<Posts> save(@RequestBody Posts post)
	{
		ResponseEntity<Posts> response;
		try {
			response = new ResponseEntity<Posts>(this.ps.save(post),HttpStatus.OK);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
//	----------------Update post (If post belongs to logged in user or logged in user is admin)------------------------
	@PutMapping("/{id}")
	private ResponseEntity<Posts> updateByPostId(@PathVariable("id") Long id , @RequestBody Posts post)
	{
		ResponseEntity<Posts> response = new ResponseEntity<Posts>(this.ps.updateById(post, id),HttpStatus.OK);
		return response;
	}

//-------------------------DELETE POST WITH POST ID-------------------------------------------------
	@DeleteMapping("/{id}")
	private ResponseEntity<String> deleteByPostId(@PathVariable("id")Long id)
	{
		ResponseEntity<String> response ;
		try {
			response = new ResponseEntity<String>(this.ps.deletePost(id),HttpStatus.OK);
		} catch (Exception e) {
			throw e;
		}
		return response;
	}
}

