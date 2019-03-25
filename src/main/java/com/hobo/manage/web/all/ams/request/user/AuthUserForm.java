package com.hobo.manage.web.all.ams.request.user;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

import com.hobo.manage.web.all.BaseForm;

/**
 * @ClassName AuthUserForm
 * @Description 授予用户权限form
 * @Author jpg
 * @Date 2019年2月18日 下午5:34:34
 */
public class AuthUserForm extends BaseForm{

	private static final long serialVersionUID = 2674819271724127914L;
	// 代理商用户id
	@NotBlank(message="用户id不能为空")
	private String id;
	
	// 授予的菜单集合
	private Set<String> menuArray;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<String> getMenuArray() {
		return menuArray;
	}

	public void setMenuArray(Set<String> menuArray) {
		this.menuArray = menuArray;
	}
	
}
