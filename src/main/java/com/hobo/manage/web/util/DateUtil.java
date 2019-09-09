package com.hobo.manage.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * className:DateUtil.java
 * description: 时间处理工具类
 * date: 2018年7月13日
 * author:jpg
 */
public class DateUtil {
	
	/**
	 * 格式化时间为yyyy
	 */
	public static String formatDate(Date date) {
		if (null == date) {
			return null;
		}
		String str = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		str = formatter.format(date);
		return str;
	}
	
	public static String formatStringDate(Date date) {
		if (null == date) {
			return null;
		}
		String str = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		str = formatter.format(date);
		return str;
	}
	public static Date formatDate(String dateStr) {
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date=formatter.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * description: 获取当前时间年份
	 * retrun_type:int
	 * date: 2018年7月13日
	 * author:jpg
	 */
	public static int getCurrentYear() {
		Calendar a=Calendar.getInstance();
		int result = a.get(Calendar.YEAR);
		return result;
	}
	
	public static void main(String[] args) {
		  Calendar a=Calendar.getInstance();
		  System.out.println(a.get(Calendar.YEAR));//得到年
	}
}
