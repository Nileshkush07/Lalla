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

import com.dollop.adda.bean.Hotel;
import com.dollop.adda.service.Hotelservice;

@RestController
@RequestMapping("/hotel")
public class Hotelcontroller {
	
	@Autowired
	private Hotelservice hs;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		ResponseEntity<Hotel> response=new ResponseEntity<Hotel>(this.hs.create(hotel),HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/get")
	public ResponseEntity<Hotel> getHotel(@PathVariable Integer id){
		ResponseEntity<Hotel> response=new ResponseEntity<Hotel>(this.hs.get(id),HttpStatus.OK);
		return response;
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Hotel>> getAll(){
		ResponseEntity<List<Hotel>> response=new ResponseEntity<List<Hotel>>(this.hs.getAll(),HttpStatus.OK);
		return response;
	}
	
}
