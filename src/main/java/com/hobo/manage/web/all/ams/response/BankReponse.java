 package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;

 /**
 * @ClassName: BankReponse
 * @Description: 银行list
 * @author zf-g0108
 * @date 2019年3月5日
 *
 */
public class BankReponse implements Serializable  {

	private static final long serialVersionUID = -5843659731029038977L;
	// 银行代码
	private String id;
	// 银行名称
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
