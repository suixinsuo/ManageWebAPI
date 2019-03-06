 package com.hobo.manage.web.all.merchant.request;

import com.hobo.manage.web.all.BaseForm;

 /**
 * @ClassName: ModifyPwdForm
 * @Description: 修改密码form
 * @date 2019年3月6日
 *
 */
public class ModifyPwdForm extends BaseForm{

	private static final long serialVersionUID = 1L;
	// 旧密码
	private String oldPwd;
	// 新密码
	private String newPwd;
	
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
}
