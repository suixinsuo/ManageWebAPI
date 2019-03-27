 package com.hobo.manage.web.all.merchant.request;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;
import com.hobo.manage.web.all.ams.constant.RegularValidator;

 /**
 * @ClassName: ApplyRefundForm
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zf-g0108
 * @date 2019年3月19日
 *
 */
public class ApplyRefundForm extends BaseForm {

	private static final long serialVersionUID = 5139498302486053685L;
	// 退款金额
	@NotBlank(message="退款金额不能为空")
	@Pattern(regexp = RegularValidator.REGEX_AMOUNT, message = "金额格式不合法")
	private String refundAmount;
	
	// 退款订单号
	@NotBlank(message="订单号不能为空")
	private String orderId;

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
