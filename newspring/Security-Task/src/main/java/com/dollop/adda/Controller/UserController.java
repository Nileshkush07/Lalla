package com.dollop.adda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dollop.adda.bean.User;
import com.dollop.adda.srvice.Userservice;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Userservice us;
	
	@GetMapping("/reg")
	public String showReg() {
		
		return "UserRegister";
	}
	
	
	@GetMapping("/save")
	public String saveUser(@ModelAttribute User user,Model model) {
		Integer id= us.saveUser(user);
		String message="User'"+id+"'created";
		model.addAttribute("message",message);
		return "UserRegister";
	}
	
	
	

}
