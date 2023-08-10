package com.dollop.adda.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Rating {
	@Id
	private String ratingId;
	private String uid;
	private String hotelid;
	private int rating;
	private String feedback;
	

}
