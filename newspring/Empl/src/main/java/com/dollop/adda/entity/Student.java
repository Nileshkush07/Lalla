package com.dollop.adda.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="std")
public class Student {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stdid;
	@Column(name="sname")
	private String stdname;
	@Column(name="sfee")
	private Double stdfee;
	@Column(name="sdoj")
	@Temporal(TemporalType.TIMESTAMP)
    private Date stdDoj;
}
