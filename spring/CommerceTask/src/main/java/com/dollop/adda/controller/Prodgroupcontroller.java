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

import com.dollop.adda.bean.Prodgroup;
import com.dollop.adda.service.Prodgroupservice;
@RestController
@RequestMapping("/pg")
public class Prodgroupcontroller {

	@Autowired
	private Prodgroupservice pgs;
	
	@GetMapping("/list")
	private ResponseEntity<List<Prodgroup>> getProdgroup()
	{
		ResponseEntity<List<Prodgroup>> response = new ResponseEntity<List<Prodgroup>>(this.pgs.getProdgroup(),HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/save")
	private ResponseEntity<Prodgroup> save(@RequestBody Prodgroup prodgroup)
	{
		ResponseEntity<Prodgroup> response = new ResponseEntity<Prodgroup>(this.pgs.save(prodgroup),HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/updatepg/{id}")
	public ResponseEntity<Prodgroup> updateProdgroup(@PathVariable("id") Prodgroup proudgroup){
		ResponseEntity<Prodgroup> response=new ResponseEntity<Prodgroup>(this.pgs.updateProdgroup(proudgroup),HttpStatus.OK);
		return response;
	}

	@PostMapping("/getpg/{id}")
	public ResponseEntity<Prodgroup> getProdgroup(@PathVariable("id") Integer id){
		ResponseEntity<Prodgroup> response=new ResponseEntity<Prodgroup>(this.pgs.getProdgroup(id),HttpStatus.OK);
		return response;
	}
}
