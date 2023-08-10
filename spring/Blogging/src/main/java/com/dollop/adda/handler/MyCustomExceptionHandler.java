package com.dollop.app.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dollop.app.entity.MyErrorResponse;
import com.dollop.app.exception.AlbumNotFoundException;
import com.dollop.app.exception.CommentsNotFoundException;
import com.dollop.app.exception.EmailAlreadyExistException;
import com.dollop.app.exception.PhotoNotFoundException;
import com.dollop.app.exception.PostNotFoundException;
import com.dollop.app.exception.UserAlreadyExistException;
import com.dollop.app.exception.UserNotFoundException;

@RestControllerAdvice

public class MyCustomExceptionHandler {
	/*
	 * @ExceptionHandler(StudentNotFoundException.class) public
	 * ResponseEntity<String> showCustomErrorMessage(StudentNotFoundException snfe)
	 * { return new
	 * ResponseEntity<String>(snfe.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); }
	 */

	@ExceptionHandler(UserNotFoundException.class)

	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(UserNotFoundException unfe) {

		return new ResponseEntity<MyErrorResponse>(

				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(PostNotFoundException.class)

	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(PostNotFoundException unfe) {

		return new ResponseEntity<MyErrorResponse>(

				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(UserAlreadyExistException.class)

	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(UserAlreadyExistException unfe) {

		return new ResponseEntity<MyErrorResponse>(

				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(EmailAlreadyExistException.class)

	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(EmailAlreadyExistException unfe) {

		return new ResponseEntity<MyErrorResponse>(

				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(CommentsNotFoundException.class)

	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(CommentsNotFoundException unfe) {

		return new ResponseEntity<MyErrorResponse>(

				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}
	@ExceptionHandler(AlbumNotFoundException.class)
	
	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(AlbumNotFoundException unfe) {
		
		return new ResponseEntity<MyErrorResponse>(
				
				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(PhotoNotFoundException.class)
	
	public ResponseEntity<MyErrorResponse> showCustomErrorMessage(PhotoNotFoundException unfe) {
		
		return new ResponseEntity<MyErrorResponse>(
				
				new MyErrorResponse(new Date().toString(), "Exception in Process", 500, unfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
