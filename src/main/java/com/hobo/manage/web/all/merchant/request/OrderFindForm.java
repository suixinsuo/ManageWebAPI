 package com.hobo.manage.web.all.merchant.request;

import com.hobo.manage.web.all.BaseForm;
import com.hobo.manage.web.all.PageForm;

 /**
 * @ClassName: OrderFindForm
 * @Description: 订单查询form
 * @author zf-g0108
 * @date 2019年3月9日
 *
 */
public class OrderFindForm extends PageForm {

	private static final long serialVersionUID = -1552723707196241699L;
	
	// 下单开始时间
	private String beginOrderDate;
	// 下单结束时间
	private String endOrderDate;
	// 付款开始时间
	private String beginPayDate;
	// 付款结束时间
	private String endPayDate;
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
	public String getBeginOrderDate() {
		return beginOrderDate;
	}
	public void setBeginOrderDate(String beginOrderDate) {
		this.beginOrderDate = beginOrderDate;
	}
	public String getEndOrderDate() {
		return endOrderDate;
	}
	public void setEndOrderDate(String endOrderDate) {
		this.endOrderDate = endOrderDate;
	}
	public String getBeginPayDate() {
		return beginPayDate;
	}
	public void setBeginPayDate(String beginPayDate) {
		this.beginPayDate = beginPayDate;
	}
	public String getEndPayDate() {
		return endPayDate;
	}
	public void setEndPayDate(String endPayDate) {
		this.endPayDate = endPayDate;
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
}
