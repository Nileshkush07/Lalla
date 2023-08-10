package com.dollop.adda;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dollop.adda.bean.User;

@Controller
//@RequestMapping("/user")
public class Usercontroller {
	@GetMapping("/home")
	public String showHomePage() {
		return "Userhome";
		
	}
	@GetMapping("/info")

	public String showuserpage(
			ModelMap model) {
		model.addAttribute("uname","nilkesh");
		//model.addAttribute("uid","2");
		model.addAttribute("cname","lalla");
		return "Userhome"; 
		
		
		
	}
	@GetMapping("/my")
	public String showuserobject(
			Model mod
			) {
		
		User u=new User(12,"nilesh","java");
		mod.addAttribute("obj",u);
		List<User> list=Arrays.asList(
				new User(12,"nilesh","java"),
				new User(11,"nilesh11","java")
				);
		mod.addAttribute("listobj",list);
		return "Userdata";
		
		
	}
	
}
