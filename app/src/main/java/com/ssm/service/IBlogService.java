package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Blog;
import com.ssm.utils.ReturnObject;

public interface IBlogService {
	public ReturnObject addBlog(Blog blog);	
	public ReturnObject deleteBlog(int id);
	public Blog findById(Integer id);
	public ReturnObject update(Blog blog);
	public List<Blog> listBlog();

}
