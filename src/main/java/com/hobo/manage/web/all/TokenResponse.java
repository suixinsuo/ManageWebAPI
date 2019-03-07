 package com.hobo.manage.web.all;

import java.io.Serializable;

 /**
 * @ClassName: TokenResponse
 * @Description: 忘记密码校验response
 * @author zf-g0108
 * @date 2019年3月6日
 *
 */
public class TokenResponse implements Serializable{
	private static final long serialVersionUID = -7474949129871949664L;
	private String token;
	private String email;
	private String mobiel;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobiel() {
		return mobiel;
	}

	public void setMobiel(String mobiel) {
		this.mobiel = mobiel;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
