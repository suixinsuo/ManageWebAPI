package com.hobo.manage.web.ams.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.hobo.manage.web.ams.constant.RegularValidator;

/**
 * @ClassName AuthRoleForm
 * @Description 获取权限form
 * @Author jpg
 * @Date 2019年1月30日 下午8:42:46
 */
public class AuthRoleForm extends BaseForm{

	private static final long serialVersionUID = 2383718490882654554L;
	
	// 用户id
	@NotNull(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	@Pattern(regexp = RegularValidator.REGEX_EMAIL, message = "邮箱的格式不合法")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
