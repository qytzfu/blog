package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.BlogTypeMapper;
import com.ssm.pojo.BlogType;
import com.ssm.service.IBlogTypeService;
import com.ssm.utils.ReturnObject;

@Service("blogTypeService")
public class BlogTypeService implements IBlogTypeService{
	
	@Autowired
	private BlogTypeMapper blogTypeMapper;
	
	public ReturnObject insert(BlogType record)
	{
		int count = blogTypeMapper.insert(record);
		if (count != 1){
			return new ReturnObject(500);
		}
		return new ReturnObject(200);
	}

	public ReturnObject deleteById(Integer id)
	{
		int count = blogTypeMapper.deleteById(id);
		if (count != 1){
			return new ReturnObject(500);
		}
		return new ReturnObject(200);
	}
	public List<String> selectById(Integer id)
	{
		return blogTypeMapper.selectById(id);
	}
	public List<Integer> selectByType(String type)
	{
		return blogTypeMapper.selectByType(type);
	}
	
}
