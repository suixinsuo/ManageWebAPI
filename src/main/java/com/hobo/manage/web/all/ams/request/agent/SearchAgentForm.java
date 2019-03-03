package com.hobo.manage.web.all.ams.request.agent;

import com.hobo.manage.web.all.PageForm;

public class SearchAgentForm extends PageForm{

	private static final long serialVersionUID = -7748191272067422470L;
	// 开始时间
	private String beginDate;
	// 结束时间
	private String endDate;
	// 代理商编号
	private String id;
	// 代理商名称
	private String name;
	// 状态
	private String status;
	
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
