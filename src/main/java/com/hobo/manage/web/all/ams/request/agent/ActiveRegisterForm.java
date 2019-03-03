package com.hobo.manage.web.all.ams.request.agent;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class ActiveRegisterForm implements Serializable{

	private static final long serialVersionUID = -5663668933992182204L;
	// 加密过的代理商id
	@NotBlank(message="id不能为空")
	@Size(min=1, max=200, message="用户姓名长度是1-200位之间")
	private String id;
	// 用户登录密码
	@NotBlank(message="登录密码不能为空")
	@Size(min=1, max=50, message="密码长度是1-50位之间")
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}