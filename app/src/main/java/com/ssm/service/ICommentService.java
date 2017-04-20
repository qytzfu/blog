package com.ssm.service;

import com.ssm.pojo.Comment;

public interface ICommentService {
    public int insert(Comment comment);
    public int update(Comment comment);
    public Comment findById(int id);
    public int remove(int id);
    public int getCurrentFloor(int blogId);
    public int removeByBlogId(int blogId);
}
