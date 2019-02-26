package com.hobo.manage.web.ams.request.trans;

import java.io.Serializable;
import java.util.Date;

public class SearchTransferVo implements Serializable{
	
	private static final long serialVersionUID = 4788891191063685071L;
	// 转帐类型 0:提现 1:转账
	private String transferType;
	// 申请开始时间
	private Date beginApplyDate;
	// 申请结束时间
	private Date endApplyDate;
	// 转账处理开始时间
	private Date beginDealDate;
	// 转账处理结束时间
	private Date endDealDate;
	// 转账记录id
	private String id;
	// 转账状态 0: 转账申请 1: 转账成功 2: 转账失败 3: 转账取消 4：转账处理中
	private String transferStatus;
	// 页数
	private String page;
	// 每页记录条数
	private String limit;
	// 账号id
	private String accountId;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
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
	public Date getBeginDealDate() {
		return beginDealDate;
	}
	public void setBeginDealDate(Date beginDealDate) {
		this.beginDealDate = beginDealDate;
	}
	public Date getEndDealDate() {
		return endDealDate;
	}
	public void setEndDealDate(Date endDealDate) {
		this.endDealDate = endDealDate;
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
}
