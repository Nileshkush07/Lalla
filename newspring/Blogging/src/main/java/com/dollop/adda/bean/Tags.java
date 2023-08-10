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
@Table(name="tags")
public class Tags {
@Id
private Integer t_id;
	
	private String t_name;
	
private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
}
