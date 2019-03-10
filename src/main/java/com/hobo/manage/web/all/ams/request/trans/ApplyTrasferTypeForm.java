 package com.hobo.manage.web.all.ams.request.trans;

import com.hobo.manage.web.all.BaseForm;

 /**
 * @ClassName: ApplyTrasferTypeForm
 * @Description: 获取提现或者转账的类型
 * @author zf-g0108
 * @date 2019年3月10日
 *
 */
public class ApplyTrasferTypeForm extends BaseForm{
	private static final long serialVersionUID = 571222657889539506L;
	
	// 转帐类型 0:提现 1:转账
	private String transferType;

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	
}
