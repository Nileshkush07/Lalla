package com.dollop.adda.rp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.dollop.adda.bean.Employee;
import com.dollop.adda.repo.EmpRepo;
//@Component
public class Runnerpage implements CommandLineRunner {
	@Autowired
	private EmpRepo rr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Pageable p=PageRequest.of(0, 4);
		Page<Employee> page=rr.findAll (p);
		page.getContent().forEach(System.out::println);
        //mea data
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.isEmpty());
		System.out.println(page.hasNext());
		System.out.println(page.hasPrevious());
		System.out.println(page.getTotalPages());
		System.out.println(page.getTotalElements());
		System.out.println(page.getSize());
		System.out.println(page.hasContent());
		
	}

}
