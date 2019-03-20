 package com.hobo.manage.web.all.merchant.request;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;

 /**
 * @ClassName: OrderDetailForm
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zf-g0108
 * @date 2019年3月19日
 *
 */
public class OrderDetailForm extends BaseForm {

	private static final long serialVersionUID = 2454120845574866694L;
	@NotBlank(message="订单号不能为空")
	private String orderId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}
