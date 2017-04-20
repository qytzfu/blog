package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Author;
import com.ssm.service.IAuthorService;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @RequestMapping("/show/{id}")
    public String toIndex(HttpServletRequest request, @PathVariable("id")int id) {
        Author author = authorService.findById(id);
        System.out.println(author.getUsername());
        return "list";
    }
    @RequestMapping("/show")
    public String toIndex(HttpServletRequest request) {
        System.out.println("aaa");
        return "list";
    }
}