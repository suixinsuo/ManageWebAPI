package com.hobo.manage.web.ams.constant;


/**
 * className:CacheConstant.java
 * description: 缓存key前缀
 * date: 2018年6月23日
 * author:jpg
 */
public class CacheConstant {
	
	/**
	 * description: 获取登录缓存key
	 * retrun_type:String
	 * date: 2018年6月24日
	 * author:jpg
	 */
	public static String getLoginKey(String mobile) {
		return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getLoginKey")
					.append(mobile).toString();
	}
	
	public static String getLoginPwdErrorTimeKey(String id) {
		return new StringBuffer().append("com.hobo.manage.web.ams.constant.CacheConstant.getLoginPwdErrorTimeKey")
				.append(id).toString();
	}
}
