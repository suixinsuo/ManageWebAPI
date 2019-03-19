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
	AGENT_FORGET_PWD_BYEMAIL("agent_forget_pwd_byemail","忘记密码校验验证码邮件"),
	AGENT_MODIFY_EMAILORMOBILE_BYEMAIL("agent_modify_emailormobile_byemail","修改邮箱，手机号校验邮件"),
	
	APPLY_TRANSFER("apply_transfer","申请转账"),
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
