 package com.hobo.manage.web.all;

import java.io.Serializable;

 /**
 * @ClassName: SendMobileForm
 * @Description: 发送手机验证码
 * @date 2019年3月7日
 *
 */
public class SendMobileForm implements Serializable{

	private static final long serialVersionUID = 4671680935952954743L;
	// 发送验证码功能类型，
	// forgetPwdByMobile:忘记密码,modifyMobileByMobile 修改手机号，applyTransferByMobile 申请转账，applyCashByMobile 申请提现，
	// forgetPwdByEmail:忘记密码,modifyMobileByEmail 修改手机号，applyTransferByEmail 申请转账，applyCashByEmail 申请提现，
	private String function;
	
	// 发送短信或者邮件携带的校验参数
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

}
