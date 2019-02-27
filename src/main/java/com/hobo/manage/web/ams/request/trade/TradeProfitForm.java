package com.hobo.manage.web.ams.request.trade;

import com.hobo.manage.web.ams.request.PageForm;

/**
 * @ClassName TradeProfitForm
 * @Description 交易分润查询form
 * @Date 2019年2月27日 下午10:09:29
 */
public class TradeProfitForm extends PageForm{

	private static final long serialVersionUID = 6939575318320126327L;
	// 查询开始时间
	private String beginDate;
	// 结束时间
	private String endDate;
	// 交易编号
	private String transId;
	
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
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
}
