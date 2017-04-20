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
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	AuthorService authorService;
	
    @RequestMapping(value="/show")
    public String index(HttpServletRequest request) throws Exception {
    	return "registerPage";
    }
    

    @RequestMapping(value="/register",method=RequestMethod.POST)
    @ResponseBody
    public JSONObject register(Author author)
    {
    	 Author find = authorService.findByName(author.getUsername());
		 JSONObject jsonObject = new JSONObject();
		 System.out.println("this");
    	 if(find == null)
    	 {
    		 jsonObject.put("status", "success");
    		 //如果插入的数据没有数据库的列多？
    		 authorService.insert(author);
    	 }
    	 else
    		 jsonObject.put("status", "fail");
    	 System.out.println(jsonObject.get("status"));
    	 return jsonObject;
    }
}
