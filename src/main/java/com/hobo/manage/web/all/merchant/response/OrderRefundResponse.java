 package com.hobo.manage.web.all.merchant.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

 /**
 * @ClassName: OrderRefundResponse
 * @Description: 退款订单response
 * @author zf-g0108
 * @date 2019年3月19日
 *
 */
public class OrderRefundResponse implements Serializable {

	private static final long serialVersionUID = 1L;
    // 平台订单号
	private String orderId;
	// 退款编号
	private String refundId;
	// 申请时间
	private String applyDate;
	// 退款状态
	private String refundStatus;
	// 退款时间
	private String refundDate;
	// 退款金额
	private BigDecimal refundAmount;
	// 订单金额
    private BigDecimal orderMoney;
    // 订单手续费
    private BigDecimal refundCharges;
    
	public BigDecimal getRefundCharges() {
		return refundCharges;
	}
	public void setRefundCharges(BigDecimal refundCharges) {
		this.refundCharges = refundCharges;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public BigDecimal getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}
	public BigDecimal getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getRefundDate() {
		return refundDate;
	}
	public void setRefundDate(String refundDate) {
		this.refundDate = refundDate;
	}
	
}
