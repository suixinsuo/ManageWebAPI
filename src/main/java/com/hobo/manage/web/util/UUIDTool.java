package com.hobo.manage.web.util;

import java.util.UUID;

public class UUIDTool {
	
	/**
	 * description: 生成32位唯一uuid
	 * retrun_type:String
	 * date: 2018年6月23日
	 * author:jpg
	 */
	public static String getUUID() {  
        return UUID.randomUUID().toString().replace("-", "");  
    }  
	
	public static void main(String[] args) {
		System.out.println(UUIDTool.getUUID());
	}
}
