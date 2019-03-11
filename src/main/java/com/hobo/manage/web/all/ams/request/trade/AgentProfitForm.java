 package com.hobo.manage.web.all.ams.request.trade;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;
import com.hobo.manage.web.all.PageForm;

 /**
 * @ClassName: AgentProfitForm
 * @Description: 查询代理商分润报表
 * @author zf-g0108
 * @date 2019年3月11日
 *
 */
public class AgentProfitForm extends PageForm{

	private static final long serialVersionUID = -1134511115392341876L;
	
	// 开始时间，时间格式yyyyMMdd
	@NotBlank(message="开始时间不能为空")
	private String beginDate;
	// 结束时间
	@NotBlank(message="结束时间不能为空")
	private String endDate;
	
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
