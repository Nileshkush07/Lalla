package com.dollop.adda.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.repo.EmpRepo;
//@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private EmpRepo rr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	rr.saveAll(
		//		Arrays.asList(
			//			new Employee("1","raj","1000","cs"),
				//		new Employee("5","jatin","2000","is"),
					//	new Employee("4","rahul","3000","et")
						//
						//)
				
			//	);
		//List<Employee> findAll = rr.findAll(Sort.by(Direction.DESC,"empsalary"));

		//rr.getAllEmps().forEach(System.out::println);
	}

}
