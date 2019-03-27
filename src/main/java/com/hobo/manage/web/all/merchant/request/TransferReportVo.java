package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName TransferReportVo
 * @Description 查询商户报表vo
 * @Date 2019年3月26日 下午4:12:56
 */
public class TransferReportVo implements Serializable {

	private static final long serialVersionUID = 5295186228709421572L;
	private Date beginDate;
	// 结束时间
	private Date endDate;
	// 页数
	private String page;
	// 每页记录条数
	private String limit;
	// 账号
	private String accountId;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
