package com.dollop.app.exception;

public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  UserNotFoundException(String msg)
	{
		super(msg);
	}
	
}
