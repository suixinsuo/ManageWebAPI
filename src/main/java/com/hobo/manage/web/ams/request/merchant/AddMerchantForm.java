package com.hobo.manage.web.ams.request.merchant;

import com.hobo.manage.web.ams.request.BaseForm;

public class AddMerchantForm extends BaseForm{

	private static final long serialVersionUID = 4963307903814951287L;
	// 商户性质 0：企业 1：个人
	private String isEnterprise;
	// 商户名称
	private String name;
	// 注册邮箱
	private String email;
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
