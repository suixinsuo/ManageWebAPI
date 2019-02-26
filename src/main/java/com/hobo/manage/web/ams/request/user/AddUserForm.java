package com.hobo.manage.web.ams.request.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.ams.constant.RegularValidator;
import com.hobo.manage.web.ams.request.BaseForm;

/**
 * @ClassName AddUserForm
 * @Description 新增用户信息form
 * @Author jpg
 * @Date 2019年2月18日 下午5:28:05
 */
public class AddUserForm extends BaseForm{

	private static final long serialVersionUID = 5279970293081940596L;
	// 用户姓名
	@NotBlank(message="用户姓名不能为空")
	@Size(min=1, max=50, message="用户姓名长度是1-50位之间")
	private String name;
	// 职务
	@NotBlank(message="职务不能为空")
	@Size(min=1, max=10, message="职务长度是1-20位之间")
	private String position;
	// 性别：F：女性 M：男性
	@NotBlank(message="性别不能为空")
	@Size(min=1, max=1, message="性别格式不合法")
	private String sex;
	// 邮箱
	@NotBlank(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	@Pattern(regexp = RegularValidator.REGEX_EMAIL, message = "邮箱的格式不合法")
	private String email;
	// 手机号码
	@NotBlank(message="手机号码不能为空")
	@Size(min=1, max=15, message="长度是1-50位之间")
	@Pattern(regexp = RegularValidator.REGEX_MOBILE, message = "手机号格式不合法")
	private String mobile;
	
	private String ip;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
