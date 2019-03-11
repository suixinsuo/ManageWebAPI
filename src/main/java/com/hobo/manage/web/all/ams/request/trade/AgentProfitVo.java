 package com.hobo.manage.web.all.ams.request.trade;

import java.io.Serializable;
import java.util.Date;

 /**
 * @ClassName: AgentProfitVo
 * @Description: 代理商清分查询条件
 * @author zf-g0108
 * @date 2019年3月11日
 *
 */
public class AgentProfitVo implements Serializable{

	private static final long serialVersionUID = 7421478285735119802L;
	
	private String beginDate;
	private String endDate;
	private String  agentId;
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
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
}
