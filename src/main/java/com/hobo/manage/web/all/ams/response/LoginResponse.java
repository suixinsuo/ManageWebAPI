package com.hobo.manage.web.all.ams.response;

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
