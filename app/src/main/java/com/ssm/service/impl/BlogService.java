package com.ssm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.BlogMapper;
//import com.ssm.dao.BlogTypeMapper;
import com.ssm.pojo.Blog;
import com.ssm.service.IBlogService;


@Service("blogService")
public class BlogService implements IBlogService{
	@Autowired
	private BlogMapper blogmapper;
//	
////	@Autowired
////	private BlogTypeMapper blogtypemapper;
//	
//	public ReturnObject addBlog(Blog blog){		
//	
//		int count = blogmapper.insert(blog);
//		if (count != 1){
//			return new ReturnObject(500);
//		}
//		return new ReturnObject(200);
//	}
//	public ReturnObject deleteBlog(int id){
//		int count = blogmapper.remove(id);
//		if (count != 1){
//			return new ReturnObject(500);
//		}
//		return new ReturnObject(200);
//	}
//	public Blog findById(Integer id)
//	{
//		return blogmapper.findById(id);
//	}
//	public ReturnObject update(Blog blog)
//	{
//		int count = blogmapper.update(blog);
//		if (count != 1){
//			return new ReturnObject(500);
//		}
//		return new ReturnObject(200);
//	}
//	public List<Blog> listBlog()
//	{
//		return blogmapper.listAllBlog();
//	}
//	@Override
//	public List<Blog> listPage(int pageNumber) {
//		// TODO Auto-generated method stub
//		PageInfo pageInfo = new PageInfo(pageNumber);
//		
//		int pageSize = pageInfo.getPageSize();
//		int start = (pageInfo.getCurrentPage() -1) * pageSize;
//		return blogmapper.listPage(start, pageSize);
//	}
	
	@Override
	public Blog findById(int id) {
		// TODO Auto-generated method stub
		return blogmapper.findById(id);
	}
	@Override
	public int insert(Blog blog) {
		// TODO Auto-generated method stub
		return blogmapper.insert(blog);
	}
	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return blogmapper.remove(id);
	}
	@Override
	public int update(Blog blog) {
		// TODO Auto-generated method stub
		return blogmapper.update(blog);
	}
	
	@Override
	public List<Blog> getBlogPage(int start, int pageSize) {
		// TODO Auto-generated method stub
		return blogmapper.listPage(start, pageSize);
	}
}
