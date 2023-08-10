package com.dollop.adda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.GrpVarient;
import com.dollop.adda.service.GrpVarientservice;

@RestController
@RequestMapping("/grpvr")
public class Grpvarientcontroller {
	
	@Autowired
	private GrpVarientservice gvs;
	
	@PostMapping("/savegv")
	public ResponseEntity<GrpVarient> saveGrpVarient(@RequestBody GrpVarient grpvarient){
		
		ResponseEntity<GrpVarient> response=new ResponseEntity<GrpVarient>(this.gvs.saveGrpVarient(grpvarient),HttpStatus.OK);
		return response;
	}

}
