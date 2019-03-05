package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.util.Date;

public class MerchantInfoResponse implements Serializable{

	private static final long serialVersionUID = -728400742751848310L;
	// 商家id
    private String id;

    // 企业性质
    private String isEnterprise;

    // 商家名称
    private String name;

    // 商家状态
    private String status;

    // 商家id
    private Date signDate;
    
    private String statusName;

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
        this.id = id == null ? null : id.trim();
    }

    public String getIsEnterprise() {
        return isEnterprise;
    }

    public void setIsEnterprise(String isEnterprise) {
        this.isEnterprise = isEnterprise == null ? null : isEnterprise.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

   
}
