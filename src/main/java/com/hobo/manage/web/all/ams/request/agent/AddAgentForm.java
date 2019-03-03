package com.hobo.manage.web.all.ams.request.agent;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;
import com.hobo.manage.web.all.ams.constant.RegularValidator;

/**
 * @ClassName AddAgentForm
 * @Description 新增代理商form
 * @Author jpg
 * @Date 2019年2月19日 下午5:22:09
 */
public class AddAgentForm extends BaseForm{

	private static final long serialVersionUID = -4513036366275465658L;
	// 代理商性质 0：企业 1：个人
	@NotBlank(message="代理商性质不能为空")
	@Pattern(regexp = "[01]", message = "代理商性质值只能为0或1")
	private String isEnterprise;
	// 代理商名称
	@NotBlank(message="代理商名称不能为空")
	@Size(min=1, max=50, message="代理商名称1到50位之间")
	private String name;
	// 邮箱
	@NotBlank(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	@Pattern(regexp = RegularValidator.REGEX_EMAIL, message = "邮箱的格式不合法")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsEnterprise() {
		return isEnterprise;
	}
	public void setIsEnterprise(String isEnterprise) {
		this.isEnterprise = isEnterprise;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
