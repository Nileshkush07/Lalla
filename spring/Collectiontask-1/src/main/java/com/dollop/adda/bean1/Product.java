package com.dollop.adda.bean1;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.ui.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="prod")
public class Product {
	public Product(int pid2, String code2, List<com.dollop.adda.bean2.Model> asList) {
		// TODO Auto-generated constructor stub
	}

	@Id
	private Integer pid;
	
	private String code;
	
	@OneToMany
@ElementCollection
//@CollectionTable(name = "listmodel", joinColumns = @JoinColumn(name = "midFK"))
//@CollectionTable(name="model",joinColumns=JoinColumn="midFK")
@JoinColumn(name="mid")
	private List<Model>  models;

} 
