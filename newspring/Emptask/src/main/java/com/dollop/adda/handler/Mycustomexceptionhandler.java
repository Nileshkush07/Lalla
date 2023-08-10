package com.dollop.adda.handler;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dollop.adda.exception.ProductNotfoundException;
import com.dollop.adda.mer.MyErrorResponse;

@RestControllerAdvice
public class Mycustomexceptionhandler {

	/*
	 * @ExceptionHandler(ProductNotfoundException.class) public
	 * ResponseEntity<String> showcustomerror(ProductNotfoundException pnfe){
	 * 
	 * return new
	 * ResponseEntity<String>(pnfe.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); }
	 */
	
	
	@ExceptionHandler(ProductNotfoundException.class)
	public ResponseEntity<MyErrorResponse> showcustomerror(ProductNotfoundException pnfe){
		
		return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(new Date().toString(),"Exception in process",500,pnfe.getMessage()),HttpStatus.OK);
				
				

	}

}
