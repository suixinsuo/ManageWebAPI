package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransferInfoResponse implements Serializable{

	private static final long serialVersionUID = -4914661895142219301L;
	// 转帐记录ID号
	private String id;
	// 申请转帐日期
	private Date applyDate;
	// 转帐的金额
	private BigDecimal transferMoney;
	// 手续费
	private BigDecimal charges;
	// 转帐类型 0:提现 1:转账
	private String transferType;
	// 转帐状态(已建好举类型，编码时注意使用) 0: 转账申请
	//  1: 转账成功 2: 转账失败 3: 转账取消 4：转账处理中
	private String transferStatus;
	// 处理转帐日期
	private Date dealDate;
	// 收款帐号
	private String receiveAccount;
	// 收款户名
	private String receiveAccountName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public BigDecimal getTransferMoney() {
		return transferMoney;
	}
	public void setTransferMoney(BigDecimal transferMoney) {
		this.transferMoney = transferMoney;
	}
	public BigDecimal getCharges() {
		return charges;
	}
	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getTransferStatus() {
		return transferStatus;
	}
	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public Date getDealDate() {
		return dealDate;
	}
	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}
	public String getReceiveAccount() {
		return receiveAccount;
	}
	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	public String getReceiveAccountName() {
		return receiveAccountName;
	}
	public void setReceiveAccountName(String receiveAccountName) {
		this.receiveAccountName = receiveAccountName;
	}
}
