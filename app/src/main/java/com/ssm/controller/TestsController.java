package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/test")
public class TestsController {
	
	@RequestMapping("/test2")
	public String index()
	{
		return "hello2";
	}
}
