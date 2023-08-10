package com.dollop.adda.Exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("Resource not Found on server !!");
	}

	public ResourceNotFoundException(String message) {
		super(message); 
	}
	
}
