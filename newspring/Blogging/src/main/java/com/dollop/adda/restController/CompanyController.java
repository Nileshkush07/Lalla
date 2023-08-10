package com.dollop.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.app.entity.Company;
import com.dollop.app.service.CompanyService;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
	@Autowired
	private CompanyService cmpnService;
	@PostMapping("/save")
	private ResponseEntity<Company> save(@RequestBody Company cmpn)
	{
		ResponseEntity<Company> response = new ResponseEntity<Company>(this.cmpnService.save(cmpn),HttpStatus.OK);
		return response;
	}
	@GetMapping("/{id}")
	private ResponseEntity<Company> getCompany(@PathVariable("id") Long id)
	{
		ResponseEntity<Company> response = new ResponseEntity<Company>(this.cmpnService.getCompany(id),HttpStatus.OK);
		return response;
	}
}
