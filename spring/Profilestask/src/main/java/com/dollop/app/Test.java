package com.dollop.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
@ComponentScan("com.dollop")
public class Test implements CommandLineRunner {
	@Autowired
 private DBConnection db;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print(db);
		
	}

}
