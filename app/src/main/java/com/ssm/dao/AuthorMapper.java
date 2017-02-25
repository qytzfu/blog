package com.ssm.dao;

import com.ssm.pojo.Author;

public interface AuthorMapper {

    public int insertSelective(Author record);
    public int insert(Author record);
    public int update(Author record);
}