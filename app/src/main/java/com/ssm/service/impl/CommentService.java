package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.CommentMapper;
import com.ssm.pojo.Comment;
import com.ssm.service.ICommentService;

@Service("commentService")
public class CommentService implements ICommentService{
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public Comment findById(int id) {
		// TODO Auto-generated method stub
		return commentMapper.findById(id);
	}
	@Override
	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		return commentMapper.insert(comment);
	}
	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return commentMapper.remove(id);
	}
	@Override
	public int update(Comment comment) {
		// TODO Auto-generated method stub
		return commentMapper.update(comment);
	}
	@Override
	public int getCurrentFloor(int blogId) {
		// TODO Auto-generated method stub
		return commentMapper.getCurrentFloor(blogId);
	}
	
	@Override
	public int removeByBlogId(int blogId) {
		// TODO Auto-generated method stub
		return commentMapper.removeByBlogId(blogId);
	}
}
