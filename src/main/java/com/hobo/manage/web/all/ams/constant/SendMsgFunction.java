 package com.hobo.manage.web.all.ams.constant;

 /**
 * @ClassName: SendMsgFunction
 * @Description: 发送消息类型
 * @date 2019年3月11日
 *
 */
public enum SendMsgFunction {
	// 发送短信短息
	FORGET_PWD_BYMOBILE("forgetPwdByMobile", "忘记密码"),
	MODIFY_MOBILE_BYMOBILE("modifyMobileByMobile", "修改手机号"),
	APPLY_TRANSFER_BYMOBILE("applyTransferByMobile", "申请转账"),
	APPLY_CASH_BYMOBILE("applyCashByMobile", "申请提现"),
	
	// 发送邮件
	FORGET_PWD_BYEMAIL("forgetPwdByEmail", "忘记密码"),
	MODIFY_MOBILE_BYEMAIL("modifyMobileByEmail", "修改手机号"),
	APPLY_TRANSFER_BYEMAIL("applyTransferByEmail", "申请转账"),
	APPLY_CASH_BYEMAIL("applyCashByEmail", "申请提现"),
	;
	
	private String id;
	private String name;

	private SendMsgFunction(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * description: 根据id获取描述 
	 * retrun_type:String 
	 * date: 下午2:20:58 
	 * author:jpg
	 */
	public static String getName(String id) {
		for (SendMsgFunction us : SendMsgFunction.values()) {
			if (us.getId().equals(id)) {
				return us.name;
			}
		}
		return null;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
