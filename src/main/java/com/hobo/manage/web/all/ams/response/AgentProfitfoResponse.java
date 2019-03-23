 package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.math.BigDecimal;

 /**
 * @ClassName: AgentProfitfoResponse
 * @Description: 代理商清分报表response
 * @date 2019年3月11日
 *
 */
public class AgentProfitfoResponse  implements Serializable{

	private static final long serialVersionUID = 1829764571681055090L;
	// 交易日期
	private String transDay;
	
	private String agentId;
	// 交易类型
	private String businessId;
	// 交易金额
	private BigDecimal transAmount;
	// 代理商手续费
    private BigDecimal agentCharges;
    // 结算状态，0：未结算  1：已结算
    private String settleStatus;
    // 结算状态名称
    private String settleStatusName;
    public String getSettleStatusName() {
		return settleStatusName;
	}

	public void setSettleStatusName(String settleStatusName) {
		this.settleStatusName = settleStatusName;
	}

	public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public BigDecimal getAgentCharges() {
        return agentCharges;
    }

    public void setAgentCharges(BigDecimal agentCharges) {
        this.agentCharges = agentCharges;
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

	public String getTransDay() {
		return transDay;
	}

	public void setTransDay(String transDay) {
		this.transDay = transDay;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	
}
