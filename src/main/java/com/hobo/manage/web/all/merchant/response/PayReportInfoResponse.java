 package com.hobo.manage.web.all.merchant.response;

import java.io.Serializable;
import java.math.BigDecimal;

 /**
 * @ClassName: PayReportInfoResponse
 * @Description: 支付报表response
 * @date 2019年3月20日
 */
public class PayReportInfoResponse implements Serializable {

	private static final long serialVersionUID = 2240014377450579401L;
	// 支付业务类型id
	private String businessId;
	
	// 交易笔数
	private Integer transCount;
	// 交易金额
	private BigDecimal transAmount;
	// 交易手续费
	private BigDecimal transCharges;
	// 交易类型
	private String tradetypeId;
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public Integer getTransCount() {
		return transCount;
	}
	public void setTransCount(Integer transCount) {
		this.transCount = transCount;
	}
	public BigDecimal getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}
	public BigDecimal getTransCharges() {
		return transCharges;
	}
	public void setTransCharges(BigDecimal transCharges) {
		this.transCharges = transCharges;
	}
	public String getTradetypeId() {
		return tradetypeId;
	}
	public void setTradetypeId(String tradetypeId) {
		this.tradetypeId = tradetypeId;
	}
}
