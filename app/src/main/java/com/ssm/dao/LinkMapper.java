package com.ssm.dao;

import com.ssm.pojo.Link;

public interface LinkMapper {
	public int deleteByPrimaryKey(Integer id);

	public int insert(Link record);

	public int insertSelective(Link record);

	public Link selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(Link record);

	public int updateByPrimaryKey(Link record);
}