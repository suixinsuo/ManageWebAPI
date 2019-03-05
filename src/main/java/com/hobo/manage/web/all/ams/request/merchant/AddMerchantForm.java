package com.hobo.manage.web.all.ams.request.merchant;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;
import com.hobo.manage.web.all.ams.constant.RegularValidator;

public class AddMerchantForm extends BaseForm{

	private static final long serialVersionUID = 4963307903814951287L;
	// 商户性质 0：企业 1：个人
	@NotBlank(message="商户性质不能为空")
	@Pattern(regexp = "[01]", message = "代理商性质值只能为0或1")
	private String isEnterprise;
	// 商户名称
	@NotBlank(message="商户名称不能为空")
	@Size(min=1, max=50, message="商户名称1到50位之间")
	private String name;
	// 注册邮箱
	@NotBlank(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	@Pattern(regexp = RegularValidator.REGEX_EMAIL, message = "邮箱的格式不合法")
	private String email;
	// 客户端请求ip
	private String ip;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
