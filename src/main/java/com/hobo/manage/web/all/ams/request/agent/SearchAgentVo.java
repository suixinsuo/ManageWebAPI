package com.hobo.manage.web.all.ams.request.agent;

import java.io.Serializable;
import java.util.Date;

public class SearchAgentVo implements Serializable{

	private static final long serialVersionUID = -7748191272067422470L;
	// 开始时间
	private Date beginDate;
	// 结束时间
	private Date endDate;
	// 代理商编号
	private String id;
	// 代理商名称
	private String name;
	// 状态
	private String status;
	
	private String email;
	private String parentId;
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
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
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
