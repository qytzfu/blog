package com.ssm.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.pojo.Blog;
import com.ssm.service.impl.BlogService;
import com.ssm.service.impl.BlogTypeService;
import com.ssm.utils.ReturnObject;

@Controller
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogService blogService;
	@Autowired 
	private BlogTypeService blogTypeService;
	
	@RequestMapping(value="/article",method=RequestMethod.GET)
	public String getBlogById(Model model,int blogId)
	{
		Blog blog = blogService.findById(blogId);
		model.addAttribute("blog",blog);
		
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("user", user);
		return "blog";
	}

	@ResponseBody
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ReturnObject deleteBlogById(int blogId){		
		return  blogService.deleteBlog(blogId);
	}
	
	@ResponseBody
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ReturnObject addBlog(Blog blog){		
		return  blogService.addBlog(blog);
	}	
	
	@ResponseBody
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ReturnObject update(Blog blog){		
		return  blogService.update(blog);
	}
	
	@RequestMapping(value="/allArticle")
	public String getAllBlog(Model model)
	{
		List<Blog> blogs = blogService.listBlog();
		model.addAttribute("allblogs",blogs);
		return "blogs";
	}
	
	@RequestMapping(value="/selectedArticle",method=RequestMethod.GET)
	public String getAllBlog(Model model,String type)
	{
//		List<Blog> blogs = blogService.listBlog();
//		model.addAttribute("allblogs",blogs);
//		return "blogs";
		
		List<Integer> blogsId = blogTypeService.selectByType(type);
		List<Blog> blogs = new ArrayList<>();
        Iterator it1 = blogsId.iterator();
		while(it1.hasNext())
		{
			int blogid = (int)it1.next();
			blogs.add(blogService.findById(blogid));
		}
		model.addAttribute("selectblogs",blogs);
		return "selectedBlog";
	}
}
