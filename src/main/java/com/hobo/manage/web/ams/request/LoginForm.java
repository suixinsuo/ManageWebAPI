package com.hobo.manage.web.ams.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @ClassName LoginForm
 * @Description 登录请求form
 * @Author jpg
 * @Date 2019年1月27日 下午9:51:59
 */
public class LoginForm extends BaseForm {

	private static final long serialVersionUID = -4538310811687398602L;
	
	// 登录密码
	@NotNull(message="登录密码不能为空")
	@Size(min=1, max=50, message="密码必须是1-50位之间")
	private String password;
	
	// 图片验证码
	@NotNull(message="图片验证码不能为空")
	@Size(min=4, max=4, message="图片验证码必须为4位")
	private String imageCode;

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
