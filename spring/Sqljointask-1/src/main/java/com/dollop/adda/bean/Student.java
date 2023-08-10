package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="std")
public class Product {
	@Id
	private Integer sid;
	
	private String Sname;
	@OneToMany
	//@ElementCollection
	//@JoinColumn(name="aid")

}
