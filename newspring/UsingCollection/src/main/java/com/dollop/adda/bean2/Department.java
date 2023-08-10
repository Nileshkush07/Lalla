package com.dollop.adda.bean2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dollop.adda.bean1.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
public class Department {
	@Id
	private Integer dId;
	
	private String dname;
	
	private String dadmin;


}
