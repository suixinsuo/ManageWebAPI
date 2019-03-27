package com.hobo.manage.web.all.merchant.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName TransferReportDto
 * @Description 商户转账报表dto
 * @Date 2019年3月26日 下午4:17:51
 */
public class TransferReportDto implements Serializable {

	private static final long serialVersionUID = 5201630786422339765L;
	// 转账类型 0:提现 1:转账
	private String transferType;
	// 总转账金额
	private BigDecimal transferMoney;
	// 总转账手续费
	private BigDecimal charges;
	// 总转账笔数
	private long count;
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
