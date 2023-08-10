package com.dollop.service;

import java.util.List;

import com.dollop.adda.bean.Comments;
import com.dollop.adda.bean.Post;

public interface Commentsservice {
	
	Comments save(Comments cmnt);
	Comments updateCommentByCIDorPostID(Comments cmnt,Integer p_id,Integer id);
	List<Comments> getAllCommentsByPostID(Integer id);
	Comments getCommentsByPostIdORCommentID(Integer p_id,Integer id);
	String deleteCommentByPostIdORCommentID(Integer p_id,Integer id);
	
	

}
