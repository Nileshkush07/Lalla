package com.dollop.adda.bean;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private Integer uid;
	@Column(name="username")
	private String uname;
	@Column(name="useremail")
	private String uemail;
	@Column(name="userpassword")
	private String upswd;
	@ElementCollection
	@CollectionTable(name="roles_tab",joinColumns = @JoinColumn(name="userid"))
	@Column(name="userrole")
private Set<String> uRoles;

}
