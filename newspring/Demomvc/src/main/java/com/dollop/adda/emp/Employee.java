package com.dollop.adda.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="empp")
@Entity
public class Employee {
	@Id
	@Column(name="e_id")
	private Integer empId;
	@Column(name="e_name")
	private String empName;
	@Column(name="e_city")
	private String empcity;

}
