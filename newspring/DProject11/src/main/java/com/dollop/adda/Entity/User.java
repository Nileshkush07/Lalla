package com.dollop.adda.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.dollop.adda.Entity.Rating;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="mic_user")
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	
	private String name;
	
	private String email;

	public void setUid(String randomUserId) {
		// TODO Auto-generated method stub
	
		List<Rating> ratings =new ArrayList<>();
		
		
	}

}
