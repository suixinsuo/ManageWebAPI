 package com.hobo.manage.web.all;

import java.io.Serializable;

 /**
 * @ClassName: ForgetPwdForm
 * @Description: 忘记密码校验form
 * @date 2019年3月6日
 *
 */
public class ForgetPwdForm implements  Serializable {

	private static final long serialVersionUID = 1553970253976301689L;
	// 邮箱
	private String email;
	
	// 图片验证码
	private String verifyCode;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
}
