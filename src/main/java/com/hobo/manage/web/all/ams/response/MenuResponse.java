package com.hobo.manage.web.all.ams.response;

import java.io.Serializable;
/**
 * @ClassName MenuResponse
 * @Description 授权时菜单response
 * @Author jpg
 * @Date 2019年2月18日 下午10:46:15
 */
public class MenuResponse implements Serializable{
	private static final long serialVersionUID = -8110553170924772936L;

	private String id;

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
