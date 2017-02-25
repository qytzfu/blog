package com.ssm.service;

import java.util.List;

import com.ssm.pojo.BlogType;
import com.ssm.utils.ReturnObject;

public interface IBlogTypeService {	
	public ReturnObject insert(BlogType record);
	public ReturnObject deleteById(Integer id);
	public List<String> selectById(Integer id);
	public List<Integer> selectByType(String type);
}
