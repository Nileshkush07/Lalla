package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="eee")
public class Employee {
	@Id
	@GeneratedValue(generator = "eid")
	private Integer eid;
	
	private String ename;
	
	private String edept;
	

}
