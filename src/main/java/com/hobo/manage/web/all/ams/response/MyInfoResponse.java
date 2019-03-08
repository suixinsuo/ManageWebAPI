 package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;

 /**
 * @ClassName: MyInfoResponse
 * @Description: 我的信息response
 * @date 2019年3月8日
 *
 */
public class MyInfoResponse implements Serializable {

	private static final long serialVersionUID = 8979646852314229884L;
	// 姓名
	private String name;
	// 职务
	private String position;
	// 邮箱
	private String email;
	// 手机号码
	private String mobile;
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
