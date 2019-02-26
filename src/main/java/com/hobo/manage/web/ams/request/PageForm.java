package com.hobo.manage.web.ams.request;


public class PageForm extends BaseForm {

	private static final long serialVersionUID = 5707885020076836507L;
	
	// 页数
	private String page;
	
	// 每页记录条数
	private String limit;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
	
}
