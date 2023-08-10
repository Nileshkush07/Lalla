package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name="todos")
public class todos {
	@Id
	private Integer td_id;
	
	private String title;
	
	private String td_completed;
	
	private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	

}
