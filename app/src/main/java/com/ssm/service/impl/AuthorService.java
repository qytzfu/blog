package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.AuthorMapper;
import com.ssm.pojo.Author;
import com.ssm.service.IAuthorService;

@Service("authorService")
public class AuthorService implements IAuthorService{
	
	@Autowired
	private AuthorMapper authormapper;
		
	@Override
	public Author findById(int id) {
		// TODO Auto-generated method stub
		return authormapper.findById(id);
	}
	
	@Override
	public int insert(Author author) {
		// TODO Auto-generated method stub
		return authormapper.insert(author);
	}
	
	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return authormapper.remove(id);
	}
	@Override
	public int update(Author author) {
		// TODO Auto-generated method stub
		return authormapper.update(author);
	}
	
	@Override
	public Author findByName(String username) {
		// TODO Auto-generated method stub
		return authormapper.findByName(username);
	}
	
	
    
}
