package com.dollop.adda.one;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String pwd=encoder.encode("lalla");
	System.out.println(pwd);
		
	}
	
}
