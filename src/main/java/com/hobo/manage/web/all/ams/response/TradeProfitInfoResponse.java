package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName TradeProfitInfoResponse
 * @Description 交易分润查询response
 * @Date 2019年2月27日 下午10:11:23
 */
public class TradeProfitInfoResponse implements Serializable {
	
	private static final long serialVersionUID = -5405209174792507541L;
	// 交易编号、业务、交易时间、交易金额、我的分润
	private String transId;
	// 交易时间
	private Date createDate;
    // 业务
    private String businessId;
    // 交易金额
    private BigDecimal transAmount;
    // 我的分润
    private BigDecimal myProfit;
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public BigDecimal getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}
	public BigDecimal getMyProfit() {
		return myProfit;
	}
	public void setMyProfit(BigDecimal myProfit) {
		this.myProfit = myProfit;
	}
}
