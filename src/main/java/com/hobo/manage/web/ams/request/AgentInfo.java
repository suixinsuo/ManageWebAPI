package com.hobo.manage.web.ams.request;

import java.io.Serializable;

import com.hobo.domain.agent.Agent;
import com.hobo.domain.agent.AgentUser;

/**
 * @ClassName AgentInfo
 * @Description 代理商登录会话信息
 * @Author jpg
 * @Date 2019年2月21日 下午12:30:03
 */

public class AgentInfo implements Serializable {

	private static final long serialVersionUID = 7719736655276709122L;
	// 代理商信息
	private Agent agent;
	// 代理商用户信息
	private AgentUser agentUser;
	
	public AgentInfo(Agent agent, AgentUser agentUser) {
		this.agent = agent;
		this.agentUser = agentUser;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public AgentUser getAgentUser() {
		return agentUser;
	}
	public void setAgentUser(AgentUser agentUser) {
		this.agentUser = agentUser;
	}
	
}
