package com.dollop.adda.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dollop.adda.bean.MyErrorResponse;
@RestControllerAdvice
public class Mycustomexception {

	

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showcustomerror(UserNotFoundException unfe){
		
		return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(new Date().toString(),"Exception in process",500,unfe.getMessage()),HttpStatus.OK);
				
				

	}
	
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showcustomerror(ProductNotFoundException pnfe){
		
		return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(new Date().toString(),"Exception in process",500,pnfe.getMessage()),HttpStatus.OK);
				
				

	}
	

}
