package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.CommentMapper;
import com.ssm.pojo.Comment;

@Service("commentService")
public class CommentService {
	
	@Autowired
	private CommentMapper commentmapper;
	
	public int insert(Comment record)
	{
		return commentmapper.insert(record);
	}
	public int deleteById(Integer id)
	{
		return commentmapper.deleteById(id);
	}
	public int selectById(Integer id)
	{
		return commentmapper.selectById(id);
	}
    
    //
	public List<Comment> listComment()
	{
		return commentmapper.listComment();
	}
}
