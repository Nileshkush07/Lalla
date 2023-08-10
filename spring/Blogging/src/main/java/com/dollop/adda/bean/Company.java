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
@Table(name="company")
public class Company {
@Id
	private Integer c_id;
	
	private String c_name;
	
	private String catch_phrace;
	
	private String bs;
	
private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
}
