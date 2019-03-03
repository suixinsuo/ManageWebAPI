package com.hobo.manage.web.all.ams.request.user;

import com.hobo.manage.web.all.PageForm;

/**
 * @ClassName UserSearchForm
 * @Description 用户查询form
 * @Author jpg
 * @Date 2019年2月11日 上午11:43:47
 */
public class UserSearchForm extends PageForm {

	private static final long serialVersionUID = -1679845667866557462L;
	
	// 用户姓名（模糊匹配）
	private String name;
	
	// 用户邮箱
	private String email;
	
	// 用户手机号
	private String mobile;
	
	// 用户状态 0：未启用, 1：正常； 2：锁定  9：停用；
	private String status;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
