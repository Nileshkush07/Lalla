package com.dollop.adda.cml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.Repo.Repo;
import com.dollop.adda.bean.Student;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	Repo rr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student std=new Student();
		std.setSid(1);
		std.setSname("Nilesh");
		std.setSemail("lalla@123");
		std.setSaddress("indore");
		//rr.save(std);
		//System.out.println(std);
		Iterable<Student> findALL=rr.findAll();
		//findALL.forEach(ob->System.out.println(ob));
		findALL.forEach(System.out::println);
		

	}

}
