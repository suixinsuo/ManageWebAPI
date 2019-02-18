package com.hobo.manage.web.ams.request.user;

import javax.validation.constraints.Pattern;

import com.hobo.manage.web.ams.request.BaseForm;

/**
 * @ClassName EditUserStatusForm
 * @Description 启用或者停用用户信息form
 * @Author jpg
 * @Date 2019年2月18日 下午4:30:41
 */
public class EditUserStatusForm extends BaseForm{

	private static final long serialVersionUID = 5088619281429359099L;
	
	// 待修改的状态，1.正常， 9.停用
	@Pattern(regexp = "[19]", message = "用戶状态只能为1或9")
	private String status;
	
	// 要修改的用户id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
