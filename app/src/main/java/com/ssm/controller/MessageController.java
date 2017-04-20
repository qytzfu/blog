package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Message;
import com.ssm.service.impl.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	
	@RequestMapping("/show/{id}")
	public String show(@PathVariable int id,Model model){
		List<Message> messages = messageService.getByReceiverId(id);
		model.addAttribute("messages", messages);
		return "messagePage";
	}
}
