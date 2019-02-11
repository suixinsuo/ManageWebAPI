package com.hobo.manage.web.ams.response;

import java.io.Serializable;

/**
 * @ClassName LoginResponse
 * @Description 登录请求返回参数
 * @Author jpg
 * @Date 2019年1月28日 下午2:00:06
 */
public class LoginResponse implements Serializable {

	private static final long serialVersionUID = -7448731276332646753L;
	
	// 登录返回token
	private String token;
	
	// 用户id，即邮箱
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
