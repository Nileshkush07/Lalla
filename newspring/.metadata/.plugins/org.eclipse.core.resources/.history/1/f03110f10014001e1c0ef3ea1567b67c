package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="comment")
public class Comments {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cm_id;
	
	private String cm_name;
	
	private String cm_email;
	
	private String cm_body;
	
private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
	@ManyToOne
	@JoinColumn(name="p_id")
	private Post post;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	
	
	
}
