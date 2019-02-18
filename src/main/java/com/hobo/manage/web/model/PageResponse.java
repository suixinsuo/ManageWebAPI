package com.hobo.manage.web.model;

import java.io.Serializable;
import java.util.List;

public class PageResponse<E> implements Serializable  {
	
	private static final long serialVersionUID = 4394140786190008752L;

	// 数量
	private int total;
	
	// 对象集合
	private List<E> list;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}
	
	public PageResponse(int total,List<E> list) {
		this.total = total;
		this.list = list;
	}
}
