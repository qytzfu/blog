package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Blog;

public interface BlogMapper {
	public int deleteByPrimaryKey(Integer id);

	public int insertSelective(Blog record);

	public Blog selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(Blog record);

	public int updateByPrimaryKeyWithBLOBs(Blog record);

	public int updateByPrimaryKey(Blog record);
    
	public int insert(Blog record);
    
	public int deleteById(Integer id);
	public int update(Blog record);
	public Blog selectById(Integer id);
    
    //
	public List<Blog> listBlog();
	

}