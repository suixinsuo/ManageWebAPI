package com.hobo.manage.web.all.ams.request.user;

import com.hobo.manage.web.all.BaseForm;

/**
 * @ClassName EditUserForm
 * @Description 编辑用户信息form
 * @Author jpg
 * @Date 2019年2月18日 下午5:24:00
 */
public class EditUserForm extends BaseForm{

	private static final long serialVersionUID = 4238711719245403319L;
	// 用户姓名
	private String name;
	// 用户id
	private String id;
	// 职务
	private String position;
	// 性别：F：女性 M：男性
	private String sex;
	// 邮箱
	private String email;
	// 手机号码
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	
}
