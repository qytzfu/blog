package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Comment;

public interface CommentMapper {
	public int deleteByPrimaryKey(Integer id);

	public int insertSelective(Comment record);

	public Comment selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(Comment record);

	public int updateByPrimaryKey(Comment record);
    
	public int insert(Comment record);
	public int deleteById(Integer id);
	public int selectById(Integer id);
    
    //
	public List<Comment> listComment();
}