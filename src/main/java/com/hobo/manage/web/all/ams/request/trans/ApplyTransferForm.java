package com.hobo.manage.web.all.ams.request.trans;

import java.math.BigDecimal;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;

/**
 * @ClassName ApplyTransferForm
 * @Description 申请提现form
 * @Author jpg
 * @Date 2019年2月27日 下午9:44:58
 */
public class ApplyTransferForm extends BaseForm{

	private static final long serialVersionUID = 1L;
	// 验证码校验方式 0.手机号，1.email
	@NotBlank(message="验证码校验方式不能为空")
	@Pattern(regexp = "[01]", message = "值错误")
	private String checkType;
	
	// 手机验证码或者邮箱验证码
	@NotBlank(message="验证码不能为空")
	private String verifyCode;
	
	// 提现金额 TODO 使用金额正则表达式
	@NotBlank(message="提现金额不能为空")
	private String amount;
	
	// 登录密码
	@NotBlank(message="登录密码不能为空")
	private String password;
	
	// 转账账号
	private String receiveAccount;
	
	// 转账户名
	private String receiveAccountName;
	
	// 转账银行代码
	private String  receiveBankcode;
	
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

	public String getReceiveBankcode() {
		return receiveBankcode;
	}

	public void setReceiveBankcode(String receiveBankcode) {
		this.receiveBankcode = receiveBankcode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}
