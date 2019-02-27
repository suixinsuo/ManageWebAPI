package com.hobo.manage.web.ams.request.trans;

import com.hobo.manage.web.ams.request.PageForm;

/**
 * @ClassName SearchTransferForm
 * @Description 提现转账记录form
 * @Author jpg
 * @Date 2019年2月23日 下午9:06:21
 */
public class SearchTransferForm extends PageForm {

	private static final long serialVersionUID = -6145455490052753096L;
	// 转帐类型 0:提现 1:转账
	private String transferType;
	// 申请开始时间
	private String beginApplyDate;
	// 申请结束时间
	private String endApplyDate;
	// 转账处理开始时间
	private String beginDealDate;
	// 转账处理结束时间
	private String endDealDate;
	// 转账记录id
	private String id;
	// 转账状态 0: 转账申请 1: 转账成功 2: 转账失败 3: 转账取消 4：转账处理中
	private String transferStatus;
	
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTransferStatus() {
		return transferStatus;
	}
	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
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
	public String getBeginDealDate() {
		return beginDealDate;
	}
	public void setBeginDealDate(String beginDealDate) {
		this.beginDealDate = beginDealDate;
	}
	public String getEndDealDate() {
		return endDealDate;
	}
	public void setEndDealDate(String endDealDate) {
		this.endDealDate = endDealDate;
	}
}
