package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Comment;

public interface ICommentService {
	public int insert(Comment record);
	public int deleteById(Integer id);
	public int selectById(Integer id);
    
    //
	public List<Comment> listComment();
}
