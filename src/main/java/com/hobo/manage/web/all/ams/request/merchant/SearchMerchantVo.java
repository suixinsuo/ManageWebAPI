package com.hobo.manage.web.all.ams.request.merchant;

import java.io.Serializable;
import java.util.Date;

public class SearchMerchantVo implements Serializable {
	
	private static final long serialVersionUID = 8188738329406285145L;
	// 开始时间
	private Date beginDate;
	// 结束时间
	private Date endDate;
	// 商家编号
	private String id;
	// 商家名称
	private String name;
	// 状态 0: 新增 1：提交审核 2：正常 3：审核未通过 9: 停用
	private String status;
	
	private String parentId;
	// 页数
	private String page;
	// 每页记录条数
	private String limit;
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
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
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
