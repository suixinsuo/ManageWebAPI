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
	// 交易编号
	private String transId;
	// 交易时间
	private String createDate;
    // 业务id
    private String businessId;
    // 业务名称
    private String businessName;
    // 交易金额
    private BigDecimal transAmount;
    // 我的分润
    private BigDecimal myProfit;
    
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
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
