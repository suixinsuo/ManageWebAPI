package com.hobo.manage.web.ams.request.trade;

import java.io.Serializable;
import java.util.Date;

public class TradeProfitVo implements Serializable {
	private static final long serialVersionUID = 5953834896895501885L;
	// 查询开始时间
	private Date beginDate;
	// 结束时间
	private Date endDate;
	// 交易编号
	private String transId;
	// 页数
	private String page;
	// 每页记录条数
	private String limit;
	// 一级代理商id
	private String proxy1Id;
	// 二级代理商id
	private String proxy2Id;
	// 三级代理商id
	private String proxy3Id;
	
	public String getProxy1Id() {
		return proxy1Id;
	}
	public void setProxy1Id(String proxy1Id) {
		this.proxy1Id = proxy1Id;
	}
	public String getProxy2Id() {
		return proxy2Id;
	}
	public void setProxy2Id(String proxy2Id) {
		this.proxy2Id = proxy2Id;
	}
	public String getProxy3Id() {
		return proxy3Id;
	}
	public void setProxy3Id(String proxy3Id) {
		this.proxy3Id = proxy3Id;
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
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
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
