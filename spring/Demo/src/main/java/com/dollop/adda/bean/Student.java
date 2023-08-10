package com.dollop.adda.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private String semail;
	private String saddress;

}
