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

import com.dollop.adda.bean.Post;
import com.dollop.service.Postservice;



@RestController
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private Postservice ps;
	
	@GetMapping("/postbyid/{id}")
	public ResponseEntity<Post> getPost(@PathVariable Integer id){
		ResponseEntity<Post> response=new ResponseEntity<Post>(this.ps.getPost(id),HttpStatus.OK);
		return response;
	}

	@GetMapping("/getallpost")
	public ResponseEntity<List<Post>> getallPost(){
		ResponseEntity<List<Post>> response=new ResponseEntity<List<Post>>(this.ps.getallPost(),HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/createpost")
	public ResponseEntity<Post> createPost(@RequestBody Post post){
		ResponseEntity<Post> response=new ResponseEntity<Post>(this.ps.createPost(post),HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Post> deletePost(@PathVariable Integer id){
		boolean deleted=ps.deletePost(id);
		if(deleted)
		{
			return ResponseEntity.noContent().build();
			}else {
				return ResponseEntity.notFound().build();
			}
		}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<Post> updatePost(@RequestBody Post post,Integer id){
		ResponseEntity<Post> response=new ResponseEntity<Post>(this.ps.updatePost(post, id),HttpStatus.OK);
		return response;
		
	}
}
