 package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;
import java.util.Date;

 /**
 * @ClassName: OrderRefundFindVo
 * @Description: 退款订单查询vo
 * @date 2019年3月20日
 *
 */
public class OrderRefundFindVo implements Serializable {
	private static final long serialVersionUID = 8778965890560400636L;
	// 开始申请时间
	private Date beginApplyDate;
	// 结束申请时间
	private Date endApplyDate;
	// 开始退款时间
	private Date beginRefundDate;
	// 结束退款时间
	private Date endRefundDate;
	// 退款状态  0：申请退款 1：退款处理中 2：退款成功 3：取消退款
	private String refundStatus;
	// 平台订单号
	private String orderId;
	// 退款编号
	private String refundId;
	// 商家号
	private String merchantId;
	// 页数
	private String page;
	// 每页记录条数
	private String limit;
	
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
	public Date getBeginApplyDate() {
		return beginApplyDate;
	}
	public void setBeginApplyDate(Date beginApplyDate) {
		this.beginApplyDate = beginApplyDate;
	}
	public Date getEndApplyDate() {
		return endApplyDate;
	}
	public void setEndApplyDate(Date endApplyDate) {
		this.endApplyDate = endApplyDate;
	}
	public Date getBeginRefundDate() {
		return beginRefundDate;
	}
	public void setBeginRefundDate(Date beginRefundDate) {
		this.beginRefundDate = beginRefundDate;
	}
	public Date getEndRefundDate() {
		return endRefundDate;
	}
	public void setEndRefundDate(Date endRefundDate) {
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
