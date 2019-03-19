 package com.hobo.manage.web.all;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

 /**
 * @ClassName: ForgetPwdSubmitForm
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zf-g0108
 * @date 2019年3月19日
 *
 */
public class ForgetPwdSubmitForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@NotBlank(message="token不能为空")
	private String token;
	
	@NotBlank(message="密码不能为空")
	private String password;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
