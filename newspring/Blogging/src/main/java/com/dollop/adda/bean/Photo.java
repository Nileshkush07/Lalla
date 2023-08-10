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
@Table(name="photos")
public class Photo {
	@Id
	private Integer ph_id;
	
	private String ph_title;
	
	private String ph_url;
	
	private String thumbnail_url;
	
private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
	@ManyToOne
	@JoinColumn(name="a_id")
	private Album album;

}
