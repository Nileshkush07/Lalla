package com.dollop.adda.bean;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sId;
	private String sName;
	private String sgender;

	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL) 
	@JoinColumn(name="cidfk")
	private Course course;
	
	@ElementCollection
	@CollectionTable(name="Languagestable" ,joinColumns= @JoinColumn(name="sIdfk"))
	private List<String> sLanguages;
	
	
	@ElementCollection
	@CollectionTable(name="Qualitable",joinColumns=@JoinColumn(name="sIdfk"))
	@MapKeyColumn(name="categary")
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private Map<String, Double> sQualification;
	
	

}
