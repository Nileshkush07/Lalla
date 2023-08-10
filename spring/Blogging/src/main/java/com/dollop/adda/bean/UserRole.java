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
@AllArgsConstructor 
@NoArgsConstructor
@Entity 
@Table(name="urole")
public class UserRole {
	@Id
	private Integer userrole_id;
	
	@ManyToOne
	@JoinColumn(name="r_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="user_idfk")
	private User user;

}
