package com.hobo.manage.web.service;

/**
 * className:CacheService.java
 * description: 缓存业务处理
 * date: 2018年6月23日
 * author:jpg
 */
public interface CacheService {
	/**
	 * description: 缓存里赋值键值对
	 * retrun_type:void
	 * date: 2018年6月23日
	 * author:jpg
	 */
	public void set(String key ,int time,  Object value);
	
	/**
	 * description: redis获取值
	 * retrun_type:Object
	 * date: 2018年6月23日
	 * author:jpg
	 */
	public Object get(String key);

	public void increment(String pwdErrorKey, int i, int j);
	
	/**
	 * @Title: delete
	 * @Description: 删除缓存信息
	 * @param key  void 
	 * @throws
	 */
	void delete(String key);
	
}
