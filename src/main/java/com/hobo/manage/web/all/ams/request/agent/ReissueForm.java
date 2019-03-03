package com.hobo.manage.web.all.ams.request.agent;

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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
