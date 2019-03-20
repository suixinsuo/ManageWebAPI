 package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;

import com.hobo.manage.web.all.BaseForm;
import com.hobo.manage.web.all.PageForm;

 /**
 * @ClassName: OrderRefundFindForm
 * @Description: 退款订单查询form
 * @date 2019年3月20日
 *
 */
public class OrderRefundFindForm extends PageForm{

	private static final long serialVersionUID = 8778965890560400636L;
	// 开始申请时间
	private String beginApplyDate;
	
	// 结束申请时间
	private String endApplyDate;
	
	// 开始退款时间
	private String beginRefundDate;
	// 结束退款时间
	private String endRefundDate;
	// 退款状态  0：申请退款 1：退款处理中 2：退款成功 3：取消退款
	private String refundStatus;
	// 平台订单号
	private String orderId;
	// 退款编号
	private String refundId;
	public String getBeginApplyDate() {
		return beginApplyDate;
	}
	public void setBeginApplyDate(String beginApplyDate) {
		this.beginApplyDate = beginApplyDate;
	}
	public String getEndApplyDate() {
		return endApplyDate;
	}
	public void setEndApplyDate(String endApplyDate) {
		this.endApplyDate = endApplyDate;
	}
	public String getBeginRefundDate() {
		return beginRefundDate;
	}
	public void setBeginRefundDate(String beginRefundDate) {
		this.beginRefundDate = beginRefundDate;
	}
	public String getEndRefundDate() {
		return endRefundDate;
	}
	public void setEndRefundDate(String endRefundDate) {
		this.endRefundDate = endRefundDate;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
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
}
