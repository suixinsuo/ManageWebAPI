package com.hobo.manage.web.all;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.hobo.manage.web.all.ams.constant.RegularValidator;

public class VerfifyCodeForm implements Serializable{

	private static final long serialVersionUID = -7847248016379375886L;
	
	@NotNull(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	@Pattern(regexp = RegularValidator.REGEX_EMAIL, message = "邮箱的格式不合法")
	private String email;
	
	// 验证码类型，代理商用户登录：agentLogin, 代理商找回密码：agentForgetPwd
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
