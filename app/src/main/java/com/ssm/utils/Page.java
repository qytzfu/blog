package com.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import com.ssm.pojo.Blog;

public class Page {
	//某一页的内容
	private List<Blog> blogs = new ArrayList<>();
	//总记录
	private int total;	
	//分页信息
	private PageInfo pageInfo;
	
	public Page(List<Blog> blogs,int total,PageInfo pageInfo)
	{
		//不要直接给引用，复制一份
		if(blogs != null)
		{
			this.blogs.addAll(blogs);
		}
		this.total = total;
		this.pageInfo = pageInfo;
	}	
	
	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	
}
