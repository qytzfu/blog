package com.ssm.service;

import com.ssm.pojo.Author;

public interface IAuthorService{
    public int insert(Author author);
    public int update(Author author);
    public Author findById(int id);
    public int remove(int id);
    public Author findByName(String username);
}
