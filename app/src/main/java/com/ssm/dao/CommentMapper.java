package com.ssm.dao;
import java.util.List;

import com.ssm.pojo.Blog;
import com.ssm.pojo.Comment;

public interface CommentMapper {
    public int insert(Comment comment);
    public int update(Comment comment);
    public Comment findById(int id);
    public int remove(int id);
    
	public int getCurrentFloor(int blogId);
	public int removeByBlogId(int blogId);
//	public List<Comment> listPage(int start,int pageSize);
//	
//	
//	public List<Comment> getCommentsByAuthorId(int authorId);
//	//真分页 在数据取的时候部分取
//	//假分页，全部取出之后再筛选
//	public List<Comment> getCommentsByAuthorPage(int authorId,int start,int pageSize);
}
