package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.util.Date;

public class MerchantInfoResponse implements Serializable{

	private static final long serialVersionUID = -728400742751848310L;
	
    private String id;

    private String isEnterprise;

    private String name;

    private String status;

    private Date signDate;

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
