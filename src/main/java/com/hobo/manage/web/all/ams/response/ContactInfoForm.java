package com.hobo.manage.web.all.ams.response;

import com.hobo.manage.web.all.BaseForm;

/**
 * @ClassName ContactInfoForm
 * @Description 修改邮箱或者手机号
 * @Date 2019年3月23日 下午10:06:11
 */
public class ContactInfoForm extends BaseForm{
	private static final long serialVersionUID = 1L;
	private String email;
	private String mobile;
	private String code;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
