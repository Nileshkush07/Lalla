package com.dollop.app.service;

import java.util.List;

import com.dollop.app.entity.Comments;

public interface CommentsService {
	Comments save(Comments cmnt);
	Comments updateCommentByCIDorPostID(Comments cmnt,Long postId,Long id);
	List<Comments> getAllCommentsByPostID(Long id);
	Comments getCommentsByPostIdORCommentID(Long postId,Long id);
	String deleteCommentByPostIdORCommentID(Long postId,Long id);
}
