package com.dollop.adda.controller;

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

import com.dollop.adda.bean.Student;
import com.dollop.adda.stdService.Stdservice;
@RestController
@RequestMapping("/hui")
public class Controller {
	
	
		

			
			@Autowired
			private Stdservice ss;
			
			
			@PostMapping("/studentsave")
			public ResponseEntity<Student> saveStd(@RequestBody Student student)
			{
				Student std = this.ss.saveStudent(student);
				  
				
				return new ResponseEntity<Student>(std, HttpStatus.CREATED);
			}
			
			
			@DeleteMapping("/delete/{id}")
		    public ResponseEntity<String> deleteUser(@PathVariable("id") Integer Id)
			{
		      
		      this.ss.deleteStudent(Id);
			 
		        return new ResponseEntity<>(this.ss.deleteStudent(Id), HttpStatus.OK);
		    }
			
			@PutMapping("/update")
			 public ResponseEntity<Student> updateStudent(@RequestBody Student student) 
			{
			  ResponseEntity<Student> response = new ResponseEntity<Student>(this.ss.updateStudent(student),HttpStatus.OK);
				
				 return response;
			
			}
			@GetMapping("/getall")
			public ResponseEntity<List<Student>> getallstd()
			{
				List<Student> lst =this.ss.getallStudent();
				
				return new ResponseEntity<>(lst, HttpStatus.OK);
				
			}

		}






