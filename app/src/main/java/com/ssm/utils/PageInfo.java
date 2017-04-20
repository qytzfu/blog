package com.ssm.utils;


public class PageInfo {
	private final static int DEFAULT_PAGE_EIZE = 2;
	//每页数量
	private int pageSize;
	//总数量
	private int totalCount;
	//总页数
	private int totalPage;
	//当前页
	private int currentPage;
	//
	private int beginIndex;
	//
	private boolean hasPrePage;
	//
	private boolean hasNextPage;
	
	public PageInfo()
	{
		
	}
	public PageInfo(int currentPage,int pageSize)
	{
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	public PageInfo(int currentPage)
	{
		this(currentPage,DEFAULT_PAGE_EIZE);
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}	

	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public boolean isHasPrePage() {
		return hasPrePage;
	}
	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	
}
