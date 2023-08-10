package com.dollop.adda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.Rating;
import com.dollop.adda.service.Ratingservice;




@RestController
@RequestMapping("/rating")
public class Ratingcontroller {
	
	@Autowired
	private Ratingservice rs;
	
	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		ResponseEntity<Rating> response=new ResponseEntity<Rating>(this.rs.create(rating),HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/gallrating")
	public ResponseEntity<List<Rating>> getall(){
		ResponseEntity<List<Rating>> response=new ResponseEntity<List<Rating>>(this.rs.getAll(),HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/gbyuid/{id}")
	public ResponseEntity<List<Rating>> getRatingByuid(@PathVariable Integer id){
		ResponseEntity<List<Rating>> response=new ResponseEntity<List<Rating>>(this.rs.getRatingByuid(id),HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/gbyhotelid/{id}")
	public ResponseEntity<List<Rating>> getRatingByhotelid(@PathVariable Integer id){
		ResponseEntity<List<Rating>> response=new ResponseEntity<List<Rating>>(this.rs.getRatingByhotelid(id),HttpStatus.OK);
		return response;
	}
	
}
