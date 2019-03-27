package com.hobo.manage.web.all.merchant.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName TransferReportInfoResponse
 * @Description 商戶转账报表
 * @Date 2019年3月26日 下午4:10:01
 */
public class TransferReportInfoResponse implements Serializable {

	private static final long serialVersionUID = 5201630786422339765L;
	// 转账类型 0:提现 1:转账
	private String transferType;
	// 转账类型名称
	private String transferTypeName;
	// 总转账金额
	private BigDecimal transferMoney;
	// 总转账手续费
	private BigDecimal charges;
	// 总转账笔数
	private long count;
	
	public String getTransferTypeName() {
		return transferTypeName;
	}
	public void setTransferTypeName(String transferTypeName) {
		this.transferTypeName = transferTypeName;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
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
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
}
