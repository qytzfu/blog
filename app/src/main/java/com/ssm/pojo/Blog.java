package com.ssm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Blog {

	private int id;
    private String title;
    //以后把content 改成 contentUrl
    private String content;
    private String summary;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")  
	private Date date;
    private int readTimes;
    private int authorId;
    
    
//	private List<Comment> comments;
//	private Author author;
//    是不是多余的呢
//    private String contentUrl;
//    private String authorName;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
    public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getReadTimes() {
		return readTimes;
	}
	public void setReadTimes(int readTimes) {
		this.readTimes = readTimes;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

}