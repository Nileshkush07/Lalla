package com.dollop.app.payload;

import lombok.Data;

@Data
public class UserRequest {
	private String userName;
	private String password;
}
