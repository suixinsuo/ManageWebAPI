package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;

/**
 * @ClassName LoginResponse
 * @Description 登录请求返回参数
 * @Author jpg
 * @Date 2019年1月28日 下午2:00:06
 */
public class LoginResponse implements Serializable {

	private static final long serialVersionUID = -7448731276332646753L;
	
	// 登录返回token
	private String token;
	
	// 企业性质 0：企业 1：个人
	private String isEnterprise;
	
	// 代理商状态 0: 新增  1：提交审  2：正常   3：审核未通过  9: 停用
	private String status;
	
	// 审核未通过原因
	private String reason;
	
	public String getIsEnterprise() {
		return isEnterprise;
	}

	public void setIsEnterprise(String isEnterprise) {
		this.isEnterprise = isEnterprise;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
