package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.BlogMapper;
//import com.ssm.dao.BlogTypeMapper;
import com.ssm.pojo.Blog;
import com.ssm.service.IBlogService;
import com.ssm.utils.ReturnObject;

@Service("blogService")
public class BlogService implements IBlogService{
	@Autowired
	private BlogMapper blogmapper;
	
//	@Autowired
//	private BlogTypeMapper blogtypemapper;
	
	public ReturnObject addBlog(Blog blog){		
	
		int count = blogmapper.insert(blog);
		if (count != 1){
			return new ReturnObject(500);
		}
		return new ReturnObject(200);
	}
	public ReturnObject deleteBlog(int id){
		int count = blogmapper.deleteById(id);
		if (count != 1){
			return new ReturnObject(500);
		}
		return new ReturnObject(200);
	}
	public Blog findById(Integer id)
	{
		return blogmapper.selectById(id);
	}
	public ReturnObject update(Blog blog)
	{
		int count = blogmapper.update(blog);
		if (count != 1){
			return new ReturnObject(500);
		}
		return new ReturnObject(200);
	}
	public List<Blog> listBlog()
	{
		return blogmapper.listBlog();
	}
}
