package com.dollop.adda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class DProject14Application {

	public static void main(String[] args) {
		SpringApplication.run(DProject14Application.class, args);
	}

}
