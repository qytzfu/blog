package com.ssm.pojo;

import java.util.Date;

public class Comment {

	private int id;
    private String content;
	private Date date;
    private int blogId;
    private int authorId;
    private int floor;


	private int senderId;
    private int receiverId;
    
    private Author author;
    public int getSenderId() {
		return senderId;
	}


	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}


	public int getReceiverId() {
		return receiverId;
	}


	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}
    
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

    public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}



	public int getBlogId() {
		return blogId;
	}


	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}


	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}

   
    
    
}