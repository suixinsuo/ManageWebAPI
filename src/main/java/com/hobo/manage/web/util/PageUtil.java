package com.hobo.manage.web.util;

import org.apache.commons.lang3.StringUtils;

import com.github.pagehelper.StringUtil;

/**
 * @ClassName PageUtil
 * @Description 分页参数设置
 */
public class PageUtil {
	// 每页10条
	public static final int LIMIT_TEN = 10;
	public static final int PAGE_ONE = 1;
	/**
	 * 获取分页参数，页数,默认为第一页
	 */
	public static Integer getPage(String page) {
		if (StringUtils.isBlank(page)) {
			return PAGE_ONE;
		}
		return Integer.valueOf(page);
	
	}
	
	/**
	 * 获取分页参数，每页条数,默认每页10条
	 */
	public static Integer getLimit(String limit) {
		if (StringUtils.isBlank(limit)) {
			return LIMIT_TEN;
		}
		return Integer.valueOf(limit);
	}
}
