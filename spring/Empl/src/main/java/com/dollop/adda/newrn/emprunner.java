package com.dollop.adda.newrn;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.bean.Employee;
import com.dollop.adda.repo.EmpRepo;

@Component
public class emprunner implements CommandLineRunner {
@Autowired
	private EmpRepo rr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//rr.getAllEmpName().forEach(System.out::println);

//rr.getAllEmps().forEach(System.out::println);
		
		Optional<Employee> opt=rr.getEmployeeByempname("jatin");
				if(opt.isPresent()) {
					System.out.println(opt.get());
				}
				else {
					System.out.println("not found");
				}
	}

}
