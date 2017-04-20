package com.ssm.service;



import java.util.List;

import com.ssm.pojo.Blog;


public interface IBlogService {
//	public ReturnObject addBlog(Blog blog);	
//	public ReturnObject deleteBlog(int id);
//	public Blog findById(Integer id);
//	public ReturnObject update(Blog blog);
//	public List<Blog> listBlog();
//	public List<Blog> listPage(int pageNumber);
//	
	
	
    public int insert(Blog blog);
    public int update(Blog blog);
    public Blog findById(int id);
    public int remove(int id);
    
    public List<Blog> getBlogPage(int start,int pageSize);
}
