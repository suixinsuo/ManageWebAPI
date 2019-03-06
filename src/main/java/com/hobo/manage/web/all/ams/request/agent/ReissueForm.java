package com.hobo.manage.web.all.ams.request.agent;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;

/**
 * @ClassName ReissueForm
 * @Description 补发注册邮件form
 * @Author jpg
 * @Date 2019年2月20日 下午8:44:46
 */
public class ReissueForm extends BaseForm{

	private static final long serialVersionUID = 2786181159100001081L;
	// 代理商ID,或者商家id
	private String id;
	
	// 邮箱
	@NotBlank(message="邮箱不能为空")
	@Size(min=1, max=40, message="邮箱必须是1-40位之间")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
