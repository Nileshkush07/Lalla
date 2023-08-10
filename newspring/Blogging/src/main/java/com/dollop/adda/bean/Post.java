package com.dollop.adda.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name="post")
public class Post {
@Id
	private Integer p_id;
	
	private String p_title;
	
	private String p_body;
	
	private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
    @OneToMany(mappedBy = "post")
    private List<Comments> comments;
    
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
}
