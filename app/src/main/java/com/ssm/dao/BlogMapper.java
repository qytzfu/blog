package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Blog;

public interface BlogMapper{
    public int insert(Blog blog);
    public int update(Blog blog);
    public Blog findById(int id);
    public int remove(int id);
    
//	public List<Blog> listAllBlog();
	
	public List<Blog> listPage(int start,int pageSize);
	
	
	public List<Blog> getBlogsByAuthorId(int authorId);
	//真分页 在数据取的时候部分取
	//假分页，全部取出之后再筛选
	public List<Blog> getBlogsByAuthorPage(int authorId,int start,int pageSize);
	
}