package com.hobo.manage.web.all.ams.request.trade;

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
	private String agent1Id;
	// 二级代理商id
	private String agent2Id;
	// 三级代理商id
	private String agent3Id;
	
	public String getAgent1Id() {
		return agent1Id;
	}
	public void setAgent1Id(String agent1Id) {
		this.agent1Id = agent1Id;
	}
	public String getAgent2Id() {
		return agent2Id;
	}
	public void setAgent2Id(String agent2Id) {
		this.agent2Id = agent2Id;
	}
	public String getAgent3Id() {
		return agent3Id;
	}
	public void setAgent3Id(String agent3Id) {
		this.agent3Id = agent3Id;
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
