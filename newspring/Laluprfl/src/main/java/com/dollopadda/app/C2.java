package com.dollopadda.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("PROD")
@Component
public class C2 implements CommandLineRunner{
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("hello");
		
	}

}
