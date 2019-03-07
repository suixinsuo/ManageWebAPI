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
	// 发送验证码功能类型，forgetPwd:忘记密码
	private String funtion;
	
	// 发送短信携带的校验参数
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getFuntion() {
		return funtion;
	}
	public void setFuntion(String funtion) {
		this.funtion = funtion;
	}
}
