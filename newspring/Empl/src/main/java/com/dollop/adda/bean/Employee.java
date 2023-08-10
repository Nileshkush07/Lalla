package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Lalla")
public class Employee {
	@Id
	private String empid;
	private String empname;
	private String empsalary;
	private String empdept;
}
