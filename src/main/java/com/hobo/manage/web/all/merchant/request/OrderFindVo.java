 package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;
import java.util.Date;

 /**
 * @ClassName: OrderFindVo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zf-g0108
 * @date 2019年3月9日
 *
 */
public class OrderFindVo implements Serializable {
	private static final long serialVersionUID = 884903980586426038L;
	// 下单开始时间
	private Date beginOrderDate;
	// 下单结束时间
	private Date endOrderDate;
	// 付款开始时间
	private Date beginPayDate;
	// 付款结束时间
	private Date endPayDate;
	// 商户编号
	private String merchantId;
	// 商户订单号
	private String merchantOrderId;
	// 平台订单号
	private String orderId;
	// 付款状态 0：未支付    2: 支付成功  3: 支付失败
	private String paymentStatus;
	// 订单状态    0：正常  1：已冻结 
	private String orderStatus;
	// 支付业务类型id
	private String businessId;
	// 页数
	private String page;
	// 每页记录条数
	private String limit;
	public Date getEndOrderDate() {
		return endOrderDate;
	}
	public void setEndOrderDate(Date endOrderDate) {
		this.endOrderDate = endOrderDate;
	}
	public Date getBeginPayDate() {
		return beginPayDate;
	}
	public void setBeginPayDate(Date beginPayDate) {
		this.beginPayDate = beginPayDate;
	}
	public Date getEndPayDate() {
		return endPayDate;
	}
	public void setEndPayDate(Date endPayDate) {
		this.endPayDate = endPayDate;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantOrderId() {
		return merchantOrderId;
	}
	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
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
	public Date getBeginOrderDate() {
		return beginOrderDate;
	}
	public void setBeginOrderDate(Date beginOrderDate) {
		this.beginOrderDate = beginOrderDate;
	}
	
}
