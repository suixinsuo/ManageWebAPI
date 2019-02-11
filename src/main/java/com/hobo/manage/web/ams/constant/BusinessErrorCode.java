package com.hobo.manage.web.ams.constant;

public enum BusinessErrorCode {
	
	SYSTEM_ERROR("SYSTEM_ERROR", "系统错误"),
	CACHE_SYSTEM_ERROR("CACHE_SYSTEM_ERROR", "缓存错误"),
	INPUT_LOGIN_PWD_THREE_TIMES("INPUT_LOGIN_PWD_THREE_TIMES", "输错了3次，还有2次机会"),
	LOGIN_ERROR_PWD_ERROR_MORETIMES("LOGIN_ERROR_PWD_ERROR_MORETIMES", "密码错误次数太多，锁定一个小时"),
	LOGIN_ERROR_PWD_ERROR("LOGIN_ERROR_PWD_ERROR", "密码错误"),
	ID_AGENTID_ISNOT_EXIST("ID_AGENTID_ISNOT_EXIST","用户不存在"),
	AGENTID_ISNOT_NORMAL("AGENTID_ISNOT_NORMAL","代理商id状态不正常"),
	USER_STATUS_ISNOT_NORMAL("USER_STATUS_ISNOT_NORMAL","用户状态不正常"),
	TOKEN_IS_INVALID("TOKEN_IS_INVALID", "登录已失效，请重新登录"),
	IMAGE_IS_INVALID("IMAGE_IS_INVALID", "图片验证码已失效"),
	IMAGE_IS_ERROR("IMAGE_IS_ERROR", "图片验证码错误"),
	;
	private String id;
	private String description;

	private BusinessErrorCode(String id, String description) {
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
		for (BusinessErrorCode bc : BusinessErrorCode.values()) {
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
	public static BusinessErrorCode getObject(String id) {
		for (BusinessErrorCode bc : BusinessErrorCode.values()) {
			if (bc.getId() == id) {
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
