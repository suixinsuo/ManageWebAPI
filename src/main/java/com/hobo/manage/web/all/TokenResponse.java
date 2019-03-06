 package com.hobo.manage.web.all;

import java.io.Serializable;

 /**
 * @ClassName: TokenResponse
 * @Description: 
 * @author zf-g0108
 * @date 2019年3月6日
 *
 */
public class TokenResponse implements Serializable{
	private static final long serialVersionUID = -7474949129871949664L;
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
