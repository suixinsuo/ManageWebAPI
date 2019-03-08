 package com.hobo.manage.web.all;

import org.hibernate.validator.constraints.NotBlank;

 /**
 * @ClassName: ModifyContactForm
 * @Description: 修改用户邮箱或者手机号form
 * @date 2019年3月8日
 */
public class ModifyContactForm extends BaseForm{

	private static final long serialVersionUID = -5954046029260060058L;
	// 验证方式，0.邮箱验证码+登录密码，2.手机短信验证码+登录密码
	@NotBlank(message="验证方式不能为空")
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
