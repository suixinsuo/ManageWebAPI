package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;

/**
 * @ClassName BasicInfoResponse
 * @Description 用户基本信息
 * @Date 2019年3月23日 下午12:08:06
 */
public class BasicInfoResponse implements Serializable {

	private static final long serialVersionUID = -408417972525040531L;
	// 姓名
	private String name;
	// 职务
	private String position;
	// 邮箱
	private String email;
	// 手机号码
	private String mobile;
	
	public BasicInfoResponse(String name,String position,String email,String mobile){
		this.name = name;
		this.position = position;
		this.email = email;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
