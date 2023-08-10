package com.dollop.adda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DProject13Application {

	public static void main(String[] args) {
		SpringApplication.run(DProject13Application.class, args);
	}

}
