package com.hobo.manage.web.ams.response;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName AgentUserInfoResponse
 * @Description 查询代理商用户信息response
 * @Author jpg
 * @Date 2019年2月18日 下午3:52:49
 */
public class AgentUserInfoResponse implements Serializable{
	
	private static final long serialVersionUID = 7888104974139763361L;
	private String id;
	
    private String name;

    private String status;
    // 状态名称
    private String statusName;

    private Date createTime;

    private String position;

    private String email;

    private String mobile;
    
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
