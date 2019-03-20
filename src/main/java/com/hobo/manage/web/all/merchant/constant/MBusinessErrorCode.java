package com.hobo.manage.web.all.merchant.constant;

import com.hobo.manage.web.all.ams.constant.BusinessErrorCode;

public enum MBusinessErrorCode {
	
	SYSTEM_ERROR("SYSTEM_ERROR", "系统错误"),
	CACHE_SYSTEM_ERROR("CACHE_SYSTEM_ERROR", "缓存错误"),
	IMAGE_IS_INVALID("IMAGE_IS_INVALID", "图片验证码已失效"),
	LACK_OF_COMPETENCE("LACK_OF_COMPETENCE", "无权限访问"),
	IMAGE_IS_ERROR("IMAGE_IS_ERROR", "图片验证码错误"),
	// 用户管理
	MERCHANTID_ISNOT_EXIST("MERCHANTID_ISNOT_EXIST", "用户不存在"),
	USER_STATUS_ISNOT_NORMAL("USER_STATUS_ISNOT_NORMAL","用户状态不正常"),
	MERCHANTID_ISNOT_NORMAL("MERCHANTID_ISNOT_NORMAL","商户状态不正常"),
	LOGIN_ERROR_PWD_ERROR_MORETIMES("LOGIN_ERROR_PWD_ERROR_MORETIMES", "密码错误次数太多，锁定一个小时"),
	INPUT_LOGIN_PWD_THREE_TIMES("INPUT_LOGIN_PWD_THREE_TIMES", "输错了3次，还有2次机会"),
	UPLOAD_IMAGE_FAIL("UPLOAD_IMAGE_FAIL, ", "上传图片失败"),
	PASSWORD_IS_NULL("PASSWORD_IS_NULL", "密码不能为空"),
	
	
	CHECK_SMSCODE_ERROR_TOO_MUCH("CHECK_SMSCODE_ERROR_TOO_MUCH", "尝试次数超过太多"),
	LOGIN_ERROR_PWD_ERROR("LOGIN_ERROR_PWD_ERROR", "密码错误"),
	ID_AGENTID_ISNOT_EXIST("ID_AGENTID_ISNOT_EXIST","用户不存在"),
	AGENTID_ISNOT_NORMAL("AGENTID_ISNOT_NORMAL","代理商状态不正常"),
	MERCHANTID_IS_AUDINT("MERCHANTID_IS_AUDINT","商家正在审核中，审核结果出来之后再登录"),
	TOKEN_IS_INVALID("TOKEN_IS_INVALID", "登录已失效，请重新登录"),
	USER_MUSTBE_ADMIN("USER_MUSTBE_ADMIN", "用户必须为管理员"),
	EMAIL_IS_OCCUPY("EMAIL_IS_OCCUPY", "邮箱已使用"),
	MOBILE_IS_OCCUPY("MOBILE_IS_OCCUPY", "手机号已使用"),
	URL_IS_EXPIRED("URL_IS_EXPIRED", "链接已失效"),
	OPERATION_IS_EXPIRED("OPERATION_IS_EXPIRED", "操作已失效，请返回重新发起"),
	PASSWORD_IS_NOTNORMAL("PASSWORD_IS_NOTNORMAL","密码必须是6-20 位，字母、数字、字符"),
	EDIT_EMAIL_STATUSIS_ZERO("EDIT_EMAIL_STATUSIS_ZERO","未启用的用户才能编辑邮箱"),
	GENERATE_ACTIVE_LINK_FAILURE("GENERATE_ACTIVE_LINK_FAILURE","生成激活链接失败"),
	SEND_SMS_ILLEGAL_MOBILE_FORMAT("SEND_SMS_ILLEGAL_MOBILE_FORMAT","手机号格式有误"), 
	SEND_SMS_TOO_MUCH("SEND_SMS_TOO_MUCH","短信验证码发送次数过多，请稍后重试！"), 
	SEND_SMS_TOO_FAST("SEND_SMS_TOO_FAST","短信发送次数太频繁！"), 
	SEND_SMS_INVALID("SEND_SMS_INVALID","短信验证码已失效"),  
	CHECK_SMSCODE_MOBILE_CHANGED("CHECK_SMSCODE_MOBILE_CHANGED","手机号已改变"),  
	SMSCODE_INCORRECT("SMSCODE_INCORRECT","验证码错误"),  
	
	SEND_EMAIL_TOO_FAST("SEND_EMAIL_TOO_FAST","邮件发送次数太频繁！"), 
	SMS_EIMAIL_ILLEGAL_FORMAT("SMS_EIMAIL_ILLEGAL_FORMAT","邮箱格式有误"), 
	SEND_EMAIL_TOO_MUCH("SEND_EMAIL_TOO_MUCH","邮箱验证码发送次数过多，请稍后重试！"), 
	
	
	
	// 新增代理商
	CORPORATION_IS_NULL("CORPORATION_IS_NULL","姓名为空"),
	CORPORATIONIDCARD_IS_NULL("CORPORATIONIDCARD_IS_NULL","身份证号为空"),
	NAME_IS_NULL("NAME_IS_NULL","企业名称不能为空"),
	CORPORATIONIDCARDPIC_IS_NULL("CORPORATIONIDCARDPIC_IS_NULL","身份证图片不能为空"),
	BUSINESSLICENSECODE_IS_NULL("BUSINESSLICENSECODE_IS_NULL","工商营业执照号不能为空"),
	BUSINESSLICENSEPIC_IS_NULL("BUSINESSLICENSEPIC_IS_NULL","工商营业执照图片不能为空"),
	COMPANYADDRESS_IS_NULL("COMPANYADDRESS_IS_NULL","公司地址不能为空"),
	
	// 商家管理
	NOPOWER_ADD_MERCHANT("NOPOWER_ADD_MERCHANT","只有管理员才能新增商家"),
	SEND_MERCHANT_REGISTER_EMAIL_FAIL("SEND_MERCHANT_REGISTER_EMAIL_FAIL","发送注册通知邮件失败"),

	// 提现管理
	AMOUT_IS_NOTHAVE("AMOUT_IS_NOTHAVE","提现可用余额不足"),
	RECEIVEACCOUNT_IS_NULL("RECEIVEACCOUNT_IS_NULL","转账账号不能为空"),
	RECEIVEACCOUNTNAME_IS_NULL("RECEIVEACCOUNTNAME_IS_NULL","转账户名不能为空"),
	BANKNAME_IS_NULL("BANKNAME_IS_NULL","转账银行不能为空"),
	;
	private String id;
	private String description;

	private MBusinessErrorCode(String id, String description) {
		this.id = id;
		this.description = description;
	}

	/**
	 * description: 根据id获取描述 
	 * retrun_type:String 
	 * date: 下午2:20:58 
	 * author:jpg
	 */
	public static String getDes(String id) {
		for (MBusinessErrorCode bc : MBusinessErrorCode.values()) {
			if (bc.getId() == id) {
				return bc.description;
			}
		}
		return null;
	}
	
	/**
	 * description: 根据id获取对象
	 * retrun_type:BusinessErrorCode
	 * date: 2018年6月30日
	 * author:jpg
	 */
	public static MBusinessErrorCode getObject(String id) {
		for (MBusinessErrorCode bc : MBusinessErrorCode.values()) {
			if (bc.getId().equals(id)) {
				return bc;
			}
		}
		return null;
	}
	

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
}
