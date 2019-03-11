 package com.hobo.manage.web.all.ams.request.trans;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;

 /**
 * @ClassName: GetChargesForm
 * @Description: 提现转账获取手续费
 * @date 2019年3月11日
 */
public class GetChargesForm extends BaseForm {

	private static final long serialVersionUID = 6501218531944018569L;
	
	
	// 转帐类型 0:提现 1:转账
	@NotBlank(message="转账类型不能为空")
	private String transferType;
	
	// 金额
	@NotBlank(message="转账金额不能为空")
	private String amount;

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}
