package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssm.pojo.Author;
import com.ssm.service.impl.AuthorService;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	@Autowired
	AuthorService authorService;
	
    @RequestMapping(value="/show")
    public String index(HttpServletRequest request) throws Exception {
    	return "loginPage";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public JSONObject login(Author author)
    {
    	 Author find = authorService.findByName(author.getUsername());
		 JSONObject jsonObject = new JSONObject();
		 
    	 if(find.getPassword().equals(author.getPassword()))
    	 {
    		 jsonObject.put("status", "success");
    	 }
    	 else
    		 jsonObject.put("status", "fail");
    	 System.out.println(jsonObject.get("status"));
    	 return jsonObject;
    }
}
