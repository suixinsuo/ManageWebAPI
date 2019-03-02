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
	
	public static String getActiveAgentIdEmailKey(String id) {
		return new StringBuffer().append("com.hobo.manage.web.ams.constant.CacheConstant.getActiveAgentIdEmailKey")
				.append(id).toString();
	}
	
	public static String getAuthCacheKey(String token) {
		return new StringBuffer().append("com.hobo.manage.web.ams.constant.CacheConstant.getAuthCacheKey")
				.append(token).toString();
	}
	/**
	 * @Title: getSendCodeTotalKey
	 * @Description: 发送短信总共次数缓存key
	 * @param token
	 * @return  String 
	 * @throws
	 */
	public static String getSendCodeTotalKey(String token,String key,String mobile) {
		return new StringBuffer().append("com.hobo.manage.web.ams.constant.CacheConstant.getSendCodeTotalKey")
				.append(token).append(key).append(mobile).toString();
	}
	/**
	 * @Title: getSendCodeKey
	 * @Description: 获取发送短信验证码key
	 * @param token
	 * @param key
	 * @return  String 
	 * @throws
	 */
	public static String getSendCodeKey(String token,String key,String mobile) {
		return new StringBuffer().append("com.hobo.manage.web.ams.constant.CacheConstant.getSendCodeKey")
				.append(token).append(key).append(mobile).toString();
	}
	
}
