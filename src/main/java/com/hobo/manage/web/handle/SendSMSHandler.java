package com.hobo.manage.web.handle;

/**
 * @ClassName: SendSMSHandler 
 * @Description: 发送短信Handler 
 * @date 2019年2月28日
 */
public interface SendSMSHandler {
	/**
	 * 设置有效时间(单位秒)
	 * @return
	 */
	int getTimeInterval();
	
	/**
	 * 返回模板id
	 * @param proxyUser 
	 * @return
	 */
//	String getMessageTemlateId(ProxyUser proxyUser);
//	
	/**
	 * 获取手机号码
	 * @return
	 */
//	String getdefaultMobile(ProxyUser proxyUser);
	
	/**
	 * 获取手机号码方式 0：前台；1：后台
	 * @return
	 */
	String getMobileType();
	
	/**
	 * 前置方法
	 */
//	void preHanlder(ProxyUser proxyUser);
	
	/**
	 * 后置方法
	 */
	void sufHandler();
	
	/**
	 * 设置动态参数
	 */
//	Map<String, Object> setDynamicParam(ProxyUser proxyUser, String verifyCode);
	
	/**
	 * 发送短信频率（一般情况只对发送短信验证码使用）
	 * 返回格式：n|m，表示n小时内只允许发送m次短信验证码
	 * @return
	 */
	String getFrequency();
}
