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
@Table(name="user")
public class User {
	@Id
	private Integer user_id;
	
	private String fname;
	
	private String lname;
	
	private String user_name;
	
	private String password;
	
	private String email;

	private String phone;
	
	private String website;

	private String created_at;
	
	private String updated_at;
	@ManyToOne
	@JoinColumn(name="ad_id")
	private Address address;
	@ManyToOne
	@JoinColumn(name="c_id")
	private Company compay;

}
