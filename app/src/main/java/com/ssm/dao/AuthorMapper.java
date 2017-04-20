package com.ssm.dao;

import com.ssm.pojo.Author;

public interface AuthorMapper{
    public int insert(Author author);
    public int update(Author author);
    public Author findById(int id);
    public int remove(int id);
    public Author findByName(String username);
   
}



//package com.ssm.dao;
//
//import java.util.List;
//import com.ssm.pojo.Comment;
//
//public interface CommentMapper extends BaseMapper<Comment>{
//	
//	public List<Comment> getCommentsByAuthor(int authorId);
//	public List<Comment> getCommentsByAuthorPage(int authorId,int start,int pageSize);
//	
//	public List<Comment> getCommentsByBlog(int authorId);
//	public List<Comment> getCommentsByBlogPage(int authorId,int start,int pageSize);
//}
//
//
//package com.ssm.dao;
//
//import java.util.List;
//
//import com.ssm.pojo.Message;
//
//public interface MessageMapper extends BaseMapper<Message>{
//	
//	//回复信息
//	public List<Message> getMessagesByAuthor(int receiverId);
//	public List<Message> getMessagesByAuthorPage(int receiverId,int start,int pageSize);
//	
//	//文章修改信息
//	//这个要关注功能，先等等
//	
//	public boolean hasNewMessage(int receiverId);
//	
//	//查看过回复之后，修改isRead
//	//所有该篇文章的message都已读
//	public void readMessage(int blogId);
//}
