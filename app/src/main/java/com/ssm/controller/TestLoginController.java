package com.ssm.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssm.pojo.Author;
import com.ssm.service.impl.AuthorService;

@Controller
@RequestMapping(value="/testlogin")
public class TestLoginController {

	@Autowired
	AuthorService authorService;
	
    @RequestMapping(value="/show")
    public String index(HttpServletRequest request) throws Exception {
    	return "loginPage";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public JSONObject login(Author author,HttpServletRequest request, HttpServletResponse response){
    	 Author find = authorService.findByName(author.getUsername());
		 JSONObject jsonObject = new JSONObject();
		 if (find == null){
			 return jsonObject;
		 }
		 
    	 if(find.getPassword().equals(author.getPassword())){
    		
    		jsonObject.put("status", "success");
			Cookie userNameCookie = new Cookie("loginUserName", author.getUsername());  
			Cookie passwordCookie = new Cookie("loginPassword", author.getPassword());  
			userNameCookie.setPath("/");  
			passwordCookie.setPath("/");  
			response.addCookie(userNameCookie);  
			response.addCookie(passwordCookie);  
    	 }else{
    		 jsonObject.put("status", "fail");
    	 }
    	 System.out.println(jsonObject.get("status"));
    	 return jsonObject;
    }
    

    
}