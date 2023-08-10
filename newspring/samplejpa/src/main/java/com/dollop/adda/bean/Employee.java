package com.dollop.adda.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component

public class Employee {
	
	private String empid;
	private String empname;
	private String empdept;
	

}
