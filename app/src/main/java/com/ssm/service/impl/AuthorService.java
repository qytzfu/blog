package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.AuthorMapper;
import com.ssm.pojo.Author;

@Service("authorService")
public class AuthorService {
	
	@Autowired
	private AuthorMapper authormapper;
	
    public int insert(Author record)
    {
    	return authormapper.insert(record);
    }
    public int update(Author record)
    {
    	return authormapper.update(record);
    }
}
