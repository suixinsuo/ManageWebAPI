 package com.hobo.manage.web.all;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

 /**
 * @ClassName: MsgVerifyForm
 * @Description: 短信或者邮箱验证码校验form
 * @author zf-g0108
 * @date 2019年3月8日
 *
 */
public class MsgVerifyForm implements Serializable {

	private static final long serialVersionUID = 8843144472341074128L;
	// 校验方式，可选 checkType ，mobile 手机，email 邮箱验证
	private String checkType;
	
	// 手机短信验证码
	private String mobileVerifiCode;
	
	// 邮箱验证码
//	@NotBlank(message="邮箱验证码不能为空")
	private String emailVerifiCode;
	
	// 携带的token
//	@NotBlank(message="token不能为空")
	private String token;
	
	// 密码
	private String password;
	
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMobileVerifiCode() {
		return mobileVerifiCode;
	}

	public void setMobileVerifiCode(String mobileVerifiCode) {
		this.mobileVerifiCode = mobileVerifiCode;
	}

	public String getEmailVerifiCode() {
		return emailVerifiCode;
	}

	public void setEmailVerifiCode(String emailVerifiCode) {
		this.emailVerifiCode = emailVerifiCode;
	}
}
