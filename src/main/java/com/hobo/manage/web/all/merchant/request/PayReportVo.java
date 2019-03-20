 package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;

 /**
 * @ClassName: PayReportVo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zf-g0108
 * @date 2019年3月20日
 *
 */
public class PayReportVo implements Serializable {

	private static final long serialVersionUID = 1107559353646600221L;
	
	// 查询开始时间
	private String beginDate;
	// 结束时间
	private String endDate;
	// 账户id
	private String accountId;
	
	// 页数
	private String page;
	
	// 每页记录条数
	private String limit;

	public String getBeginDate() {
		return beginDate;
	}
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
