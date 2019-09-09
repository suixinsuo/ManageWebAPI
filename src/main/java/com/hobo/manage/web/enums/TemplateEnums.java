package com.hobo.manage.web.enums;

/**
 * @ClassName: MMSTemplateEnums 
 * @Description: 代理商系统短信&邮箱模板枚举
 * @date 2019年2月28日 下午6:18:01 
 */
public enum TemplateEnums {
	
	// 短信模板
	AGENT_FORGET_PWD_BYMOBILE("agent_forget_pwd_bymobile","忘记密码校验短信"),
	
	
	// 邮件模板
	ADD_AGENT_USER_ACTIVE_EMAIL("add_agent_user_active_email","新增代理商用户激活邮件"),
	ADD_AGENT_ACTIVE_LINK("add_agent_active_link","新增代理商激活邮件"),
	ADD_MERCHANT_ACTIVE_LINK("add_merchant_active_link","新增商家激活邮件"),
	
	ADD_MERCHANTUSER_ACTIVE_LINK("add_merchantuser_active_link","新增商家用户激活邮件"),
	SEND_EMAIL_CODE("send_email_code","发送邮件验证码统一模板"),
	
	// 总后台
	ADD_SYSUSER_ACTIVE_LINK("add_sysuser_active_link","新增总后台用户激活邮件"),
	RESET_SYSUSER_PWD_ACTIVE_LINK("reset_sysuser_pwd_active_link","重置总后台用户激活邮件"),
	AUDIT_SUCCESS_AGENT_EMAIL("audit_success_agent_email","审核代理商通过通知邮件"),
	AUDIT_FAIL_AGENT_EMAIL("audit_fail_agent_email","审核代理商不通过通知邮件"),
	AUDIT_SUCCESS_MERCHANT_EMAIL("audit_success_merchant_email","审核商家通过通知邮件"),
	AUDIT_FAIL_MERCHANT_EMAIL("audit_fail_merchant_email","审核商家不通过通知邮件"),

	
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
