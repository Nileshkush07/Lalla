package com.dollop.app.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Task cls = ac.getBean("task",Task.class);
		DBConnection d = ac.getBean("ob" ,DBConnection.class);
		//System.out.println("Dollop");
		System.out.println(cls);
	//	System.out.println(d);

	}

}
