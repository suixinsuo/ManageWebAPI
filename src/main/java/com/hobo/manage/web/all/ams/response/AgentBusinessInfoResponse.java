package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName BusinessInfoResponse
 * @Description 代理商业务信息
 * @Author jpg
 * @Date 2019年3月23日 下午12:09:27
 */

public class AgentBusinessInfoResponse implements Serializable {
    private static final long serialVersionUID = -3098510917807466865L;
	// 业务id
    private String businessId;
    // 业务名称
    private String businessName;
    // 手续费分润百分比
    private BigDecimal returnRate;
    // 结算周期
    private Short settleValue;
    // 状态 0：停用 1：正常
    private String status;
    // 状态名称
    private String statusName;
    // 分润类型
    private String returnType;

    public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
    public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public BigDecimal getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(BigDecimal returnRate) {
        this.returnRate = returnRate;
    }

    public Short getSettleValue() {
        return settleValue;
    }

    public void setSettleValue(Short settleValue) {
        this.settleValue = settleValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

}
