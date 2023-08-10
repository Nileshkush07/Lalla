package com.dollop.adda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class DProject12Application {

	public static void main(String[] args) {
		SpringApplication.run(DProject12Application.class, args);
	}

}
