 package com.hobo.manage.web.all.ams.constant;

 /**
 * @ClassName: AgentStatusEnum
 * @Description: 代理商状态
 * @author zf-g0108
 * @date 2019年3月3日
 *
 */
public enum AgentStatusEnum {

	ADD("0", "新增"),
	COMMIT_AUDIT("1", "提交审核"),
	NORMAL("2", "正常"),
	AUDIT_NOTPASS("3", "审核未通过"),
	STOP("9", "停用"),
	;
	
	private String status;
	private String name;

	private AgentStatusEnum(String status, String name) {
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
		for (AgentStatusEnum us : AgentStatusEnum.values()) {
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
