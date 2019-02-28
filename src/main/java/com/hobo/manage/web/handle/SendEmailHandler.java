package com.hobo.manage.web.handle;

import java.util.Map;

/**
 * @ClassName: SendEmailHandler 
 * @Description: 发送邮件handler
 * @date 2019年2月28日 上午9:08:27 
 */
public interface SendEmailHandler {

	/**
	 * 激活链接配置项的key名
	 * 
	 * @return
	 */
	String initUrlConfig();

	/**
	 * 邮件模板id
	 * 
	 * @return
	 */
	String initTemplateId();
	
	/**
	 * 目标邮箱
	 * 
	 * @return
	 */
	String targetEmail(Object object);

	/**
	 * 自定义邮件内容（无模板的情况使用）
	 * 
	 * @return
	 */
	String initCustmerContent();

	/**
	 * 激活链接有效时间（单位：秒）
	 * 
	 * @return
	 */
	int initTimeInterval();
	/**
	 * 动态参数(普通邮件)
	 * 
	 * @return
	 */
	Map<String, Object> initDynamicParam(Object object);
	
	/**
	 * 动态参数(激活邮件  因激活邮件需要激活链接)
	 * 
	 * @return
	 */
	Map<String, String> initDynamicParam(Object object, String activelink);

}
