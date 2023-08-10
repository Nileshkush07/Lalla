package com.dollop.adda.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dollop.adda.bean.MyErrorResponse;

public class MycustomException {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showcustomerror(UserNotFoundException unfe){
		
		return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(new Date().toString(),"Exception in process",500,unfe.getMessage()),HttpStatus.OK);
				
				

	}

}
