package com.hobo.manage.web.all;

import org.hibernate.validator.constraints.NotBlank;

public class NoticeFindForm extends BaseForm {

	private static final long serialVersionUID = -604322293019648592L;
	// 公告id
	@NotBlank(message="公告id不能为空")
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
