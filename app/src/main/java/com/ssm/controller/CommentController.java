package com.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Comment;
import com.ssm.pojo.Message;
import com.ssm.service.impl.CommentService;
import com.ssm.service.impl.MessageService;




@Controller
@RequestMapping("/comment")
public class CommentController {
	
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private MessageService messageService;
	
	  @InitBinder
	  protected void initBinder(WebDataBinder binder) 
	  {
	      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	      dateFormat.setLenient(false);
	      binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	  }
	
	
	@RequestMapping("/show")
	public String show(Model model, HttpSession session){
		
//		Comment comment = commentService.findById(1);
//		model.addAttribute("comment", comment);
		//floor
		int floor = commentService.getCurrentFloor(2);
		System.out.println(floor);
		return "commentPage";
	}

	//1.js获取某个id里面的内容 并且写入
	//2.area 也是form
	//3.数据库 select order by limit （需要看多次操作的）

	@RequestMapping("/writeComment")
	public String writeComment(Model model,Comment comment, HttpSession session)
	{	
		Date date = new Date();
		comment.setDate(date);
		int floor = commentService.getCurrentFloor(comment.getBlogId());
		comment.setFloor(floor);
//		int senderId = session.getAttribute("authorId");
//		comment.setSenderId(senderId);
//		commentService.insert(comment);
		
		
		Message msg = new Message();
		msg.setBlogId(comment.getBlogId());
		msg.setContent(comment.getContent());
		msg.setDate(date);
		msg.setIsRead(0);
		msg.setReceiverId(comment.getReceiverId());
		msg.setSenderId(comment.getSenderId());
		
		messageService.insert(msg);
		
		return "emptyBlogPage"; 
	}
	
	
	@RequestMapping("/deleteComment/{id}")
	public String deleteComment(@PathVariable int id)
	{	
		commentService.removeByBlogId(id);
		return "emptyBlogPage"; 
	}	
	
	//查	
}
