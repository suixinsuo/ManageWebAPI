package com.hobo.manage.web.ams.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransferInfoResponse implements Serializable{

	private static final long serialVersionUID = -4914661895142219301L;
	private String id;
	private Date applyDate;
	private BigDecimal transferMoney;
	private BigDecimal charges;
	private String transferType;
	private String transferStatus;
	private Date dealDate;
	private String receiveAccount;
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
