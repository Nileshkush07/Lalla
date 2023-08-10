package com.dollop.adda.empcon;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dollop.adda.Repo.EmpRepo;
import com.dollop.adda.emp.Employee;
@Controller
public class Empcontroller {
	@Autowired
	private EmpRepo repo;
	
	
		@GetMapping("/show")
		public String showForm() {
			return "EmpRegister";
		}
		
		
		
		@PostMapping("/register")
		public String readData(
				@ModelAttribute Employee employee,
				Model model
				) 
		{
			System.out.println(employee);
			this.repo.save(employee);
			model.addAttribute("obj",employee);
			model.addAttribute("done","done");
			return "EmpData";
		}

		@GetMapping("/edit/{id}")
		public String edit() {
			return "EmpEdit";
		}
		
		@GetMapping("/EmpEdit/{id}")
		public String getEmployee(@PathVariable("id") Integer id,Model model) {
			System.out.println(id);
			
			Optional<Employee> emp = this.repo.findById(id);
		     model.addAttribute("employee", emp.isPresent()?emp.get():null);
		     model.addAttribute("done","Done");
			return "EmpEdit";
		}
		@GetMapping("/delete/{id}")
		public String deleteEmployee(@PathVariable("id") Integer id,Model model) {
			this.repo.deleteById(id);
			List<Employee> emplist=this.repo.findAll();
			model.addAttribute("list",emplist);
			model.addAttribute("ms","delete done");
			return "EmpRegister";
			
		}

}
