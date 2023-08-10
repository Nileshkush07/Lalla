package com.dollop.adda.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class First {
	
	@GetMapping("/hom")
	public String ShowHome() {
		
		return "home";
	}

	@GetMapping("/hell")
	public String showHello() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return " login";
	}
	
	
	@GetMapping("/admin")
	public String showAdmin() {
		return "admin";
	}
	
	
	@GetMapping("/customer")
	public String showCustomer() {
		return "customer";
	}
}
