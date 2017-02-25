package com.ssm.dao;

import java.util.List;


import com.ssm.pojo.BlogType;

public interface BlogTypeMapper {

	public int insertSelective(BlogType record);
	
	public int insert(BlogType record);
	public int deleteById(Integer id);
	public List<String> selectById(Integer id);
	public List<Integer> selectByType(String type);
	//这里不需要update 删了重加就行先deletebyid 在  insert
//    public int update(BlogType record);


}