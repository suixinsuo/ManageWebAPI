package com.hobo.manage.web.all.merchant.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.hobo.manage.web.all.ams.constant.RegularValidator;

/**
 * @ClassName LoginForm
 * @Description 商家系统登录请求form
 * @Date 2019年1月27日 下午9:51:59
 */
public class MerchantLoginForm implements Serializable {

	private static final long serialVersionUID = -4538310811687398602L;
	
	// 登录密码
	@NotNull(message="登录密码不能为空")
	@Size(min=1, max=50, message="密码必须是1-50位之间")
	private String password;
	
	// 图片验证码
	@NotNull(message="图片验证码不能为空")
	@Size(min=4, max=4, message="图片验证码必须为4位")
	private String imageCode;
	
	@NotNull(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	@Pattern(regexp = RegularValidator.REGEX_EMAIL, message = "邮箱的格式不合法")
	private String email;
	
	private String ip;
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImageCode() {
		return imageCode;
	}

	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	
}
