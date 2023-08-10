package com.dollop.adda.bean1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dollop.adda.bean2.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")

public class Employee {
@Id
	private Integer empid;
	
	private String empname;
	
	private Integer empsalary;
	@ManyToOne
	@JoinColumn(name="dId")
	private Department department;
}
