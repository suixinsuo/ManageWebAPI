package com.hobo.manage.web.ams.request.trans;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName AccountBankInfoResponse
 * @Description 获取提现response
 * @Date 2019年2月27日 下午9:40:25
 */
public class AccountBankInfoResponse implements Serializable {

	private static final long serialVersionUID = -6306259233213028199L;
	// 账户可用余额
	private BigDecimal accountAvailableAmount;
	// 银行代码
	private String bankCode;
	// 银行名称
    private String bankName;
    // 银行账号
    private String bankAccount;
    // 银行户名
    private String bankAccountName;
    // 手机号为空，则取邮箱
    private String mobile;
    // 绑定的邮箱
    private String email;
    
	public BigDecimal getAccountAvailableAmount() {
		return accountAvailableAmount;
	}
	public void setAccountAvailableAmount(BigDecimal accountAvailableAmount) {
		this.accountAvailableAmount = accountAvailableAmount;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankAccountName() {
		return bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
}
