 package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.util.List;

 /**
 * @ClassName: MyInfoResponse
 * @Description: 我的信息response
 * @date 2019年3月8日
 *
 */
public class MyInfoResponse implements Serializable {

	private static final long serialVersionUID = 8979646852314229884L;
	// 用户基本信息
	private BasicInfoResponse basicInfoResponse;
	// 用户业务信息
	private List<AgentBusinessInfoResponse> list;
	
	public MyInfoResponse () {
	}
	public MyInfoResponse (BasicInfoResponse basicInfoResponse,List<AgentBusinessInfoResponse> list) {
		this.basicInfoResponse = basicInfoResponse;
		this.list = list;
	}
	public BasicInfoResponse getBasicInfoResponse() {
		return basicInfoResponse;
	}
	public void setBasicInfoResponse(BasicInfoResponse basicInfoResponse) {
		this.basicInfoResponse = basicInfoResponse;
	}
	public List<AgentBusinessInfoResponse> getList() {
		return list;
	}
	public void setList(List<AgentBusinessInfoResponse> list) {
		this.list = list;
	}
}
