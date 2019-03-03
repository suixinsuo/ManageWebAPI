package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
import java.util.Set;

public class AuthRoleResponse implements Serializable {

	private static final long serialVersionUID = 3354528169530494782L;
	
	// 权限菜单集合
	private Set<String> authRoles;

	public Set<String> getAuthRoles() {
		return authRoles;
	}

	public void setAuthRoles(Set<String> authRoles) {
		this.authRoles = authRoles;
	}
}
