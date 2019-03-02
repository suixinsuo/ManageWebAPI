package com.hobo.manage.web.enums;

/**
 * @ClassName: MMSTemplateEnums 
 * @Description: 代理商系统短信&邮箱模板枚举
 * @date 2019年2月28日 下午6:18:01 
 */
public enum TemplateEnums {
	
	// 短信模板
	
	
	// 邮件模板
	ADD_AGENT_USER_ACTIVE_EMAIL("add_agent_user_active_email","新增代理商用户激活邮件"),
	ADD_AGENT_ACTIVE_LINK("add_agent_active_link","新增代理商激活邮件"),
	ADD_MERCHANT_ACTIVE_LINK("add_merchant_active_link","新增商家激活邮件"),
	;
	
	private String id;
	private String title = null;
	
	TemplateEnums(String id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
}
