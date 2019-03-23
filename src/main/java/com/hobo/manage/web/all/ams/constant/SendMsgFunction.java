 package com.hobo.manage.web.all.ams.constant;

 /**
 * @ClassName: SendMsgFunction
 * @Description: 发送消息类型
 * @date 2019年3月11日
 *
 */
public enum SendMsgFunction {
	// 发送短信短息
	FORGET_PWD_BYMOBILE("forgetPwdByMobile", "忘记密码","5"),
	MODIFY_MOBILE_BYMOBILE("modifyMobileByMobile", "修改手机号","2"),
	APPLY_TRANSFER_BYMOBILE("applyTransferByMobile", "申请转账","5"),
	APPLY_CASH_BYMOBILE("applyCashByMobile", "申请提现","2"),
	
	// 发送邮件
	FORGET_PWD_BYEMAIL("forgetPwdByEmail", "忘记密码","5"),
	MODIFY_MOBILE_BYEMAIL("modifyMobileByEmail", "修改手机号","2"),
	APPLY_TRANSFER_BYEMAIL("applyTransferByEmail", "申请转账","5"),
	APPLY_CASH_BYEMAIL("applyCashByEmail", "申请提现","5"),
	;
	
	// id
	private String id;
	
	// 名称
	private String name;
	
	// 有效时间，分钟为单位
	private String valiteTime;

	private SendMsgFunction(String id, String name,String valiteTime) {
		this.id = id;
		this.name = name;
		this.valiteTime = valiteTime;
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
	
	/**
	 * description: 根据id获取有效时间
	 * retrun_type:String 
	 * date: 下午2:20:58 
	 * author:jpg
	 */
	public static String getValiteTime(String id) {
		for (SendMsgFunction us : SendMsgFunction.values()) {
			if (us.getId().equals(id)) {
				return us.valiteTime;
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
	
	public String getValiteTime() {
		return valiteTime;
	}
	
	
}
