package com.hobo.manage.web.ams.request;

import java.io.Serializable;

public class BaseForm implements Serializable {

	private static final long serialVersionUID = -7220184883969264778L;
	
	// token,除开登录之后的请求必须携带token
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
