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
@Table(name="albums")
public class Album {
	@Id
	private Integer a_id;
	
	private String a_title;
	
private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	

}
