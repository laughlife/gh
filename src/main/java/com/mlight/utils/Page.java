package com.mlight.utils;

import java.util.List;
/**
 * 分页的实体类
 * @ClassName Page
 * @author wbcshy
 * @Date 2017年8月15日 下午3:45:33
 * @version 1.0.0
 */
public class Page {
	
	int defaultPageSize = 20;   //每页默认要显示的条数
	
	int page = 0;//当前第几页
	int limit = 0;//一共多少页
	int pages = 0;  //总页数
	int allCount = 0;   //总的记录数
	int size = 0;
	List list = null;   //用来做存储列表时候用
	
	
	public int getPage() {
		if(page == 0){
			return 1;
		}
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public int getSize() {
		if(this.size == 0){
			return this.defaultPageSize;
		}else{
			return size;
		}
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPages() {
		if(pages != 0){
			return this.pages;
		}else{
			double i = (this.getAllCount()*10)/(this.getSize());
			return (int)Math.ceil(i/10);
		}
		
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getLimit() {
		return this.limit == 0 ? this.getSize() : this.limit;
	}

	public int getOffset() {
		return (this.page - 1) * this.getLimit();
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getAllCount() {
		return allCount;
	}

	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}
	
	
	

}
