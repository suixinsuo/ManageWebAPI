package com.hobo.manage.web.all.ams.constant;

/**
 * @ClassName UserStatusEnum
 * @Description 代理商用户状态
 * @Author jpg
 * @Date 2019年2月26日 下午9:47:12
 */
public enum UserStatusEnum {
	NOT_USE("0", "未启用"),
	NORMAL("1", "正常"),
	LOCK("2", "锁定"),
	STOP("9", "停用"),
	;
	
	private String status;
	private String name;

	private UserStatusEnum(String status, String name) {
		this.status = status;
		this.name = name;
	}

	/**
	 * description: 根据id获取描述 
	 * retrun_type:String 
	 * date: 下午2:20:58 
	 * author:jpg
	 */
	public static String getName(String status) {
		for (UserStatusEnum us : UserStatusEnum.values()) {
			if (us.getStatus().equals(status)) {
				return us.name;
			}
		}
		return null;
	}

	public String getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}
}
