 package com.hobo.manage.web.all.merchant.request;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.PageForm;

 /**
 * @ClassName: PayReportForm
 * @Description: 支付报表查询form
 * @date 2019年3月20日
 *
 */
public class PayReportForm extends PageForm{

	private static final long serialVersionUID = -976543147981317999L;
	// 查询开始时间
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
